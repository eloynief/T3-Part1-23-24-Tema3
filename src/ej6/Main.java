package ej6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//llamar al objeto tipo scanner para poder introducir valores
		Scanner sc=new Scanner(System.in);
		
		int opc;
		
		double radio,altura;
		
		
		
		
		
	}

	//
	public static double areaVolumen(int opc, double radio, double altura) {
		double res=0;
		
		switch(opc) {
			case 1: res=3*Math.PI*radio*(altura+radio);
			case 2: res= Math.PI*Math.pow(radio, 2)*altura;
		}
		
		
		return res;
	}
	
	
}
