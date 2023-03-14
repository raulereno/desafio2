package desafios;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2a {

	public static void main(String[] args) {
		
		
				try {
					for(String linea : Files.readAllLines(Paths.get("C:\\Users\\raule\\OneDrive\\Escritorio\\BOOTCAMPS\\argentina__programa\\curso-java\\ide\\clase4\\files\\sum.txt"))) {
						String numbers[]= linea.split(" ");
						String operation = numbers[numbers.length-1];
						
						if(operation.equals("+")) {
							System.out.println(sum(numbers));
						}
						else {
							System.out.println(addition(numbers));
						}
					}
						
				} catch (Exception e) {
					System.err.println(e);
				}
			}
			
			public static int sum(String numbers[]) {
				
				int total = 0;
				
				for(String num : numbers) {
					if(!num.equals("+")) {	
						total += Integer.parseInt(num);
					}
				}
				
				return total;
			}
			public static int addition(String numbers[]) {
				
				int total = 1;
				
				for(String num : numbers) {
					
					if(!num.equals("*")) {		
						total = total * Integer.parseInt(num);
					}
				}
				
				return total;
			}
}
