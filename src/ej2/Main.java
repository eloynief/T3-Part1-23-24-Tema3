package ej2;

import java.util.Scanner;

public class Main {

	/**
	 * metodo main
	 * @param args
	 */
	public static void main(String[] args) {

		//llamar al objeto tipo scanner para poder introducir valores
		Scanner sc=new Scanner(System.in);
		
		//variables para introducir los valores
		int n1,n2;
		
		System.out.println("introduce los numerris");
		
		//
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		System.out.println();
		muestraNumero(n1, n2);
		
	}
	
	//
	public static void muestraNumero (int n1,int n2) {
		
		if(n1<n2) {
			//se puede pasar a otra funcion
			for(;n1<=n2;n1++) {
				System.out.println(n1);
			}
		}
		else if(n1>n2){
			//se puede pasar a otra funcion
			for(;n2<=n1;n2++) {
				System.out.println(n2);
			}
			
		}
		else {
			System.out.println(n1);
		}
		
	}
	

}
