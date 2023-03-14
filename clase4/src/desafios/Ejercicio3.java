package desafios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) throws Exception {
		String abecedario =" abcdefghijklmnñopqrstuvwxyz";
		Path currentPath = Paths.get("").toAbsolutePath();
		String entrada = currentPath+"\\files\\entrada.txt";
		String salida = currentPath+"\\files\\salida.txt";
		
		
		Scanner scnString = new Scanner(System.in);
		System.out.println("Ingrese el string a convertir y presione ENTER:");
		String cadenaAConvertir = scnString.next();
		Files.writeString(Paths.get(entrada), cadenaAConvertir+"\n" ,StandardOpenOption.APPEND);
		
		
		Scanner scnOpcion = new Scanner(System.in);
		System.out.println("Elija opcion:\n 1.Decodificar \n 2.Codificar ");
		int opcion = scnOpcion.nextInt();
		
		Scanner scnDesplazo = new Scanner(System.in);
		System.out.println("Elija opcion de desplazo:\n 1 \n 2 \n 3 ");
		int desplazo = scnDesplazo.nextInt();
		
		String cadenaParseada = null;
		if(opcion == 1) {
			cadenaParseada = decodificacion(abecedario,cadenaAConvertir,desplazo);
		}else if(opcion ==2) {
			cadenaParseada = codificacion(abecedario, cadenaAConvertir, desplazo);
		}else {
			System.out.println("Opcion incorrecta");
		}
				
		System.out.println(cadenaAConvertir + " --> " + cadenaParseada);
		Files.writeString(Paths.get(salida), cadenaParseada+"\n" ,StandardOpenOption.APPEND);
			
		System.out.println("La salida quedo almacenada en files/salida.txt");
		
		scnString.close();
		scnOpcion.close();
		scnDesplazo.close();
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


