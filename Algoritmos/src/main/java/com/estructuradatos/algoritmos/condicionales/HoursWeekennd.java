package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;

/**
 * Reakiza un programa que dado un día de la semana (de lunes a viernes)
 * y una hora y minutos dados, calcule cuantos minutos falta para el fin de 
 * semana
 * 
 * se considera que el fin de semana comienza el viernes a las 15:00 horas
 * @author Xavier Sanchez
 *
 */
public class HoursWeekennd {
	
	private static final double HOUR_OF_DAY = 24;
	private static final double DAY = 5;
	private static final double HOUR_WEEKEND = 15;
	private static  double numbersHourFromWeekend;
	private static double  numberDayForWeekend;
	private static double numberMinuteForWeeken;
	private static int MINUTES = 60;
	private static Scanner sc;
	public static void main(String[] args) {
		
		numberMinutesWeek();
		
		sc = new Scanner(System.in);
		System.out.println("Digite una hora: ");
		double hora = sc.nextDouble();
		
		System.out.println("Digite un dia: ");
		int dia = sc.nextInt();
		
		restMinutesWeek(hora, dia);
		
		
		
	}
	
	
	/**
	 * Metodo que retorna el numero de horas que hay desde el 
	 * lunes 00:00 horas hasta el viernes a las 15:000
	 * @return
	 */
	static void numberMinutesWeek() {
		
		
		//Variable que representa el numeros de horas hasta el fin de semana
		 numbersHourFromWeekend = HOUR_OF_DAY*(DAY-1) + HOUR_WEEKEND ;
		
		//Variable que representa el numeros de dia hasta el fin de semana
		 numberDayForWeekend = numbersHourFromWeekend/HOUR_OF_DAY;
		 
		 numberMinuteForWeeken = numbersHourFromWeekend * MINUTES;
		
		
		System.out.println("El numero de horas hasta el viernes a las 15:00 h son: " + numbersHourFromWeekend);
		System.out.println("El numero de dias hasta el fin de semana del viernes a las 15 h son: " + numberDayForWeekend);
		System.out.println("El numero de minutos que tiene el fin de semana son: " + numberMinuteForWeeken);
		
		
		
	}
	
	/**
	 * Metodo que se encarga de calcular el numero minutos que falta para llegar al fin
	 * de semana
	 */
	public static void restMinutesWeek(double hours, int day) {
		
		double result = 0;  
		double resulMinutes = 0;
		double resultMinutesWeekend = 0;
		
		if ((hours > 0 && hours <= 24) && (day >= 1 && day <= 5)) {
			
			/**
			 * Variable que se encarga de calcular las horas que han transcurrido hasta 
			 * el dia especificado
			 */
			result = hours + (HOUR_OF_DAY * (day -1));
			resulMinutes = result * MINUTES;   //variable que se encarga de calcular el numero de minutos transcurrido
			resultMinutesWeekend = 	numberMinuteForWeeken - resulMinutes;
		}
		
		System.out.println("Del dia " + day  + " a las horas " + hours 
				+ " faltarían: " + resultMinutesWeekend + " minutos para el fin de semana");
	}
	
	

}
