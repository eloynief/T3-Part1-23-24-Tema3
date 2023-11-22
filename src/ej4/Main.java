package ej4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//llamar al objeto tipo scanner para poder introducir valores
		Scanner sc=new Scanner(System.in);
		
		String caracter;
		
		boolean eVokal;
		
		System.out.println("Introduce el caracter");
		caracter=sc.next();
		
		//llama a la funcion para darle el valor
		eVokal=CompruebaVocal.compVocal(caracter);
		
		
	}

}
