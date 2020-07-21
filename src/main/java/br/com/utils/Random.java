package br.com.utils;

public class Random {
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQ0123456789";
	private static final String ALPHA_NUMERIC = "0123456789";
	private static final String ALPHABETO = "ABCDEFGHIJKLMNOPQ";
	
	public static String randomAlphaNumeric ( int count ) {
	
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));

	}
	
		return builder.toString();
	
	}
	
	public static String randomNumeric ( int count ) {
		
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC.length());
		builder.append(ALPHA_NUMERIC.charAt(character));

	}
	
		return builder.toString();
	
	}
	
	public static String randomAlfabeto ( int count ) {
		
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHABETO.length());
		builder.append(ALPHABETO.charAt(character));

	}
	
		return builder.toString();
	
	}
	
	

}