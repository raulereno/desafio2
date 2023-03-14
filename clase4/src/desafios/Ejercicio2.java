package desafios;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {

	public static void main(String[] args) {		
		try {
			for(String linea : Files.readAllLines(Paths.get("C:\\Users\\raule\\OneDrive\\Escritorio\\BOOTCAMPS\\argentina__programa\\curso-java\\ide\\clase4\\files\\sum.txt"))) {
				String numbers[]= linea.split(" ");
				System.out.println(sum(numbers));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	public static int sum(String numbers[]) {
		
		int total = 0;
		
		for(String num : numbers) {
			total += Integer.parseInt(num);
		}
		
		return total;
	}
	

}
