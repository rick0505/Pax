*** Settings ***
Library           RequestsLibrary
Library           Collections



*** Keywords ***
Abrir Navegador Na Página de Login
    [Documentation]    Abre o navegador e navega até a página de login especificada.
    Open Browser    ${URL_LOGIN}    ${BROWSER}
    Maximize Browser Window
    Wait Until Element Is Visible    id:signup-button    10s
    [Return]    ${True}

Preencher Formulário de Inscrição
    [Documentation]    Preenche os campos de nome e email na página de inscrição.
    [Arguments]    ${nome}    ${email}
    Input Text    name:name    ${nome}
    Input Text    name:email    ${email}
    Click Button    id:signup-button

Verificar Campos Obrigatórios
    [Documentation]    Verifica se a mensagem de erro sobre campos obrigatórios é exibida.
    ${erro_visivel}=    Page Should Contain    Este campo é obrigatório.
    [Return]    ${erro_visivel}

Criar Conta
    [Documentation]    Clica no botão para criar a conta após o preenchimento dos dados.
    Click Button    id:create-account
    Wait Until Page Contains    Bem-vindo à sua conta
    [Return]    ${True}

Fechar Navegador
    [Documentation]    Fecha o navegador após a execução dos testes.
    Close Browser

Abrir Navegador Na Página de Login
    [Documentation]    Abre o navegador e navega até a página de login especificada.
    Open Browser    ${URL_LOGIN}    ${BROWSER}
    Maximize Browser Window
    Wait Until Element Is Visible    id:signup-button    10s
    [Return]    ${True}

Preencher Formulário de Inscrição
    [Documentation]    Preenche os campos de nome e email na página de inscrição.
    [Arguments]    ${nome}    ${email}
    Input Text    name:name    ${nome}
    Input Text    name:email    ${email}
    Click Button    id:signup-button

Verificar Campos Obrigatórios
    [Documentation]    Verifica se a mensagem de erro sobre campos obrigatórios é exibida.
    ${erro_visivel}=    Page Should Contain    Este campo é obrigatório.
    [Return]    ${erro_visivel}

Criar Conta
    [Documentation]    Clica no botão para criar a conta após o preenchimento dos dados.
    Click Button    id:create-account
    Wait Until Page Contains    Bem-vindo à sua conta
    [Return]    ${True}

Fechar Navegador
    [Documentation]    Fecha o navegador após a execução dos testes.
    Close Browser