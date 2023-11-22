package ej10;

public class CompruebaFecha {

	public static boolean comprobacionFecha(int año,int mes,int dia) {
		
		boolean correcto=false;
		//
		if(dia<31&&dia>0&&mes<31&&mes>0) {
			correcto=true;
			
		}
		
		return correcto;
		
	}

	public static boolean comprobacionFechaEspecifico(int año,int mes,int dia) {
		
		boolean correcto=false;
		//
		if(dia<31&&dia>0&&mes<31&&mes>0) {
			correcto=true;
			
		}
		
		
		
		return correcto;
		
	}
	
}
