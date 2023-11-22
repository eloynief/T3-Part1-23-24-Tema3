package ej5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//llamar al objeto tipo scanner para poder introducir valores
		Scanner sc=new Scanner(System.in);
		
		//variables para introducir los valores
		int n1;
		
		System.out.println("introduce los numerris");
		
		//
		n1=sc.nextInt();
		
		//llama a la funcion
		tablMultiplicar(n1);
		
		
	}
	
	
	
	
	/**
	 * muestra la tabla de multiplicar del numer queyes escribes
	 * @param num
	 */
	public static void tablMultiplicar(int num) {
		
		for(int i =1;i<=10;i++) {

			System.out.println(num*i);
		}
		
		
		
	}

}
