package Clase3;

public class ejercicio2 {
	public static void main(String[] args) throws Exception {
		String abecedario =" abcdefghijklmnñopqrstuvwxyz";
		
		int desplazo = 2;
		
		String cadena = "hola que tal";
		
		String cadenaCodificada = codificacion(abecedario,cadena,desplazo);
		
		System.out.println("Cadena cofidicada -> "+cadenaCodificada);
		
		String cadenaDecodificada = decodificacion(abecedario,cadenaCodificada,desplazo);
		
		System.out.println("Cadena decodificada -> "+cadenaDecodificada);
		
	}
	
	public static String codificacion(String abecedario,String cadena,int desplazo)throws Exception{
		
		String suma ="";	
		
		for(int i = 0; i <= cadena.length()-1;i++) {
			if(cadena.charAt(i) == ' ') {
				suma = suma + abecedario.charAt( 0 + desplazo) ;
				continue;
			}
			for(int x =0; x <= abecedario.length()-1; x++) {
				 if(cadena.charAt(i) == abecedario.charAt(x)) {
					suma = suma + abecedario.charAt( x + desplazo);
				}
			}
		}
		return suma;
	}
	
	public static String decodificacion(String abecedario,String cadena,int desplazo) {
		
		String suma ="";	
		for(int i = 0; i <= cadena.length()-1;i++) {
			for(int x =0; x <= abecedario.length()-1; x++) {
				 if(cadena.charAt(i) == abecedario.charAt(x)) {
					suma = suma + abecedario.charAt( x - desplazo);
				}
			}
		}
		
		
		return suma;
	}
}
