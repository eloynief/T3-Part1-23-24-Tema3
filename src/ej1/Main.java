package ej1;

import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//llamar al objeto tipo scanner para poder introducir valores
		Scanner sc=new Scanner(System.in);
		
		
		//int para escribir el numero de veces
		int ඞ;
		
		
		System.out.println("Escribe el numero de veces que quieres escribir Eco...");
		//introduce elvalor
		ඞ=sc.nextInt();
		
		//se llama a la funcion para hacer esto
		eco(ඞ);
		
	}
	
	//funcion eco que repite la palabra eco tantas veces como escribas
		/**
		 * 
		 * @param numVeces
		 */
		public static void eco(int numVeces) {
			//funcion for para hacer que se repita el codigo tantas veces como escribas el numero
			for(int i=0;i<numVeces;i++) {
				System.out.println("Eco...");
			}
		}
	

}
