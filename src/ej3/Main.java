package ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//llamar al objeto tipo scanner para poder introducir valores
		Scanner sc=new Scanner(System.in);
		
		//variables para introducir los valores
		int n1,n2,max;
		
		System.out.println("introduce los numerris");
		
		//
		n1=sc.nextInt();
		n2=sc.nextInt();

		//se llama a la funcion para el numero maximo
		max= numeroMaximo(n1, n2);
		
		System.out.println(max);
	}
	

	//funcion que comprueba el numero maximo entre 2 numeros
	public static int numeroMaximo (int n1,int n2) {
		int max = 0;
		
		if(n1<n2) {
			max=n2;
		}
		else if(n1>n2){
			max=n1;
		}
		else {
			max=n1;
		}
		
		return max;
	}
	

}
