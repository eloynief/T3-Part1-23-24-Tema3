package ej4;

public class CompruebaVocal {

	public static boolean compVocal(String letra) {
		boolean res=false;
		
		switch(letra.toLowerCase()) {
		case "a","e","i","o","u"-> res=true;
			
		}
		return res;
		
	}
	
	
	
	
}
