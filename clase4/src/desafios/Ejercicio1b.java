package desafios;

import java.util.Scanner;

public class Ejercicio1b {

	public static void main(String[] args) {
		
		int numbers[] = new int[3];
		
		Scanner scnOne = new Scanner(System.in);
		System.out.println("Elija el primer numero a ordenar");
		numbers[0] = scnOne.nextInt();
		
		Scanner scnTwo = new Scanner(System.in);
		System.out.println("Elija el segundo numero a ordenar");
		numbers[1] =  scnTwo.nextInt();
		
		Scanner scnThree = new Scanner(System.in);
		System.out.println("Elija el tercer numero a ordenar");
		numbers[2] =  scnThree.nextInt();
	
		Scanner scnFour = new Scanner(System.in);
		System.out.println("Elija la forma de ordenarlos:\n a.Ascendente \n d.Descendente");
		String order = scnFour.next();
	
		order(numbers,order);
		
		
		
	
		scnOne.close();
		scnTwo.close();
		scnThree.close();
		scnFour.close();
	}
	
	public static void order(int[]numbers, String order)  {
		
		
		boolean condicion = true;
		while(condicion) {
			condicion = false;
			for(int i = 0 ;i < numbers.length - 1 ;i++) {
				int aux = numbers[i];
				if(order.equals("a")) {
					
					if(aux > numbers[i+1]) {
						numbers[i]= numbers[i+1];
						numbers[i + 1]= aux;
						condicion=true;
					}
				}else {
					if(aux < numbers[i+1]) {
						numbers[i]= numbers[i+1];
						numbers[i + 1]= aux;
						condicion=true;
					}					
				}
			}
		}
		for(int x : numbers) {
			System.out.println(x);
		}
	}

}
