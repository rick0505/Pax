*** Settings ***
Library           RequestsLibrary
Library           Collections

Suite Setup       Create Session    reqres    ${BASE_URL}
Suite Teardown    Delete All Sessions

*** Variables ***
${BASE_URL}       https://reqres.in
${USER_NAME}      morpheus
${USER_JOB}       líder
${UPDATED_JOB}    senior leader

*** Keywords ***
Dado que eu tenha um payload de um novo usuário
    ${payload}=    Create Dictionary    name=${USER_NAME}    job=${USER_JOB}
    [Return]    ${payload}

Quando eu enviar uma requisição POST para "/api/users"
    [Arguments]    ${payload}
    ${response}=    POST On Session    reqres    /api/users    json=${payload}
    Set Suite Variable    ${response}    ${response}
    Log    Response: ${response.content}    console
    [Return]    ${response}

Então o código de status da resposta deve ser 201
    [Arguments]    ${response}
    Should Be Equal As Numbers    ${response.status_code}    201

E a resposta deve conter o nome do usuário "morpheus"
    [Arguments]    ${response}
    ${response_json}=    Evaluate    ${response.json()}    json
    Dictionary Should Contain Value    ${response_json}    ${USER_NAME}

E a resposta deve conter o cargo do usuário "líder"
    [Arguments]    ${response}
    ${response_json}=    Evaluate    ${response.json()}    json
    Dictionary Should Contain Value    ${response_json}    ${USER_JOB}

E eu salvo o ID do usuário da resposta
    [Arguments]    ${response}
    ${response_json}=    Evaluate    ${response.json()}    json
    ${user_id}=    Set Variable    ${response_json['id']}
    Set Suite Variable    ${user_id}    ${user_id}
    Log    User ID: ${user_id}

Quando eu enviar uma requisição GET para "/api/users/${user_id}"
    [Arguments]    ${user_id}
    ${response}=    GET On Session    reqres    /api/users/${user_id}
    [Return]    ${response}

Então o código de status da resposta deve ser 200
    [Arguments]    ${response}
    Should Be Equal As Numbers    ${response.status_code}    200

Quando eu enviar uma requisição PUT para "/api/users/${user_id}"
    [Arguments]    ${user_id}    ${payload}
    ${response}=    PUT On Session    reqres    /api/users/${user_id}    json=${payload}
    [Return]    ${response}

Então o código de status da resposta deve ser 200 para o PUT
    [Arguments]    ${response}
    Should Be Equal As Numbers    ${response.status_code}    200

Quando eu enviar uma requisição DELETE para "/api/users/${user_id}"
    [Arguments]    ${user_id}
    ${response}=    DELETE On Session    reqres    /api/users/${user_id}
    [Return]    ${response}

Então o código de status da resposta deve ser 204
    [Arguments]    ${response}
    Should Be Equal As Numbers    ${response.status_code}    204

*** Test Cases ***
Funcionalidade: Criar, Consultar, Atualizar e Deletar Usuário

Cenário: Criar um novo usuário
    Dado que eu tenha um payload de um novo usuário
    ${response}=    Quando eu enviar uma requisição POST para "/api/users"    ${payload}
    Então o código de status da resposta deve ser 201    ${response}
    E a resposta deve conter o nome do usuário "morpheus"    ${response}
    E a resposta deve conter o cargo do usuário "líder"    ${response}
    E eu salvo o ID do usuário da resposta    ${response}

Cenário: Consultar o usuário criado
    ${user_id}=    Get Suite Variable    ${user_id}
    ${response}=    Quando eu enviar uma requisição GET para "/api/users/${user_id}"    ${user_id}
    Então o código de status da resposta deve ser 200    ${response}

Cenário: Atualizar o usuário criado
    ${user_id}=    Get Suite Variable    ${user_id}
    ${payload}=    Create Dictionary    name=${USER_NAME}    job=${UPDATED_JOB}
    ${response}=    Quando eu enviar uma requisição PUT para "/api/users/${user_id}"    ${user_id}    ${payload}
    Então o código de status da resposta deve ser 200 para o PUT    ${response}

Cenário: Deletar o usuário criado
    ${user_id}=    Get Suite Variable    ${user_id}
    ${response}=    Quando eu enviar uma requisição DELETE para "/api/users/${user_id}"    ${user_id}
    Então o código de status da resposta deve ser 204    ${response}

Cenário: Consultar o usuário deletado
    ${user_id}=    Get Suite Variable    ${user_id}
    ${response}=    Quando eu enviar uma requisição GET para "/api/users/${user_id}"    ${user_id}
    Então o código de status da resposta deve ser 404    ${response}
