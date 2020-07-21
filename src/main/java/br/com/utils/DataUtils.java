package br.com.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {
	
	public static Date obterDataComDiferencaDias(int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		return calendar.getTime();
	}
	
	public static String obterDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		return format.format(data);
	}
	
	public static String formatDate(Date data, String pattern) {
		DateFormat simpleFormat = new SimpleDateFormat(pattern);
		return simpleFormat.format(data);
	}
	
	public static Date now() {
		return new Date();
	}


}
