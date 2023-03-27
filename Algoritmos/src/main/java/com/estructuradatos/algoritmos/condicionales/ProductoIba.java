package com.estructuradatos.algoritmos.condicionales;

import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;


/**
 * Escribe un programa que calcule el precio final de un producto.
 * segun su precio antes de impuestos 
 * @author usuario
 *
 */
public class ProductoIba {
	
	
	
	private static final double IVA_GENERAL = 21;
	private static final double IVA_REDUCIDO = 10;
	private static final double IVA_SUPER_REDUCIDO = 4;
	private static String iva;
	private static int valor;
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor Ingrese el tipo de iva: ");
		iva = sc.next();
		
		System.out.println("Por favor ingrese el valor del producto: ");
		valor = sc.nextInt();
		
		System.out.println("tipo de codigo promocional");
		String codigoPromociona = sc.next();
		
		
		
		
		switch (iva) {
		case "General":
			
			switch (codigoPromociona) {
			case "menos5":
				
				System.out.println(operacion(valor, IVA_GENERAL)-5);
				break;

			case "mitad":
				System.out.println(operacion(valor, IVA_REDUCIDO)/2);
				break;
			case "5por":
				double valorProducto = operacion(valor, IVA_SUPER_REDUCIDO);
				double menos5porciento = valorProducto - (operacion(valor, IVA_SUPER_REDUCIDO)*5)/100 ;
				System.out.println();
				break;
			default:
				System.out.println("No aplica codigo de promocion ");
				break;
			}
			break;

		case "reducido":
			switch (codigoPromociona) {
			case "menos5":
				
				System.out.println(operacion(valor, IVA_GENERAL)-5);
				break;

			case "mitad":
				System.out.println(operacion(valor, IVA_REDUCIDO)/2);
				break;
			case "5por":
				double valorProducto = operacion(valor, IVA_SUPER_REDUCIDO);
				double menos5porciento = valorProducto - (operacion(valor, IVA_SUPER_REDUCIDO)*5)/100 ;
				System.out.println();
				break;
			default:
				System.out.println("No aplica codigo de promocion ");
				break;
			}
			break;
			
		case "superReducido":
			switch (codigoPromociona) {
			case "menos5":
				
				System.out.println(operacion(valor, IVA_GENERAL)-5);
				break;

			case "mitad":
				System.out.println(operacion(valor, IVA_REDUCIDO)/2);
				break;
			case "5por":
				double valorProducto = operacion(valor, IVA_SUPER_REDUCIDO);
				double menos5porciento = valorProducto - (operacion(valor, IVA_SUPER_REDUCIDO)*5)/100 ;
				System.out.println();
				break;
			default:
				System.out.println("No aplica codigo de promocion ");
				break;
			}
			
			break;
		default:
			break;
		}
	}
	
	
	public static double operacion(double valor, double tipoIva) {
		
		double result = ((valor * tipoIva)/100)+valor;
		String des = "EL valor del producto es: ";
		
		return   result;
		
	}
	


}
