package desafios;

public class Ejercicio1a {

	public static void main(String[] args) {
		
		int numbers[]= new int[3];
		
		numbers[0]= Integer.parseInt(args[0]);
		numbers[1]= Integer.parseInt(args[1]);
		numbers[2]= Integer.parseInt(args[2]);
		
		String order= args[3];

		
		orderNumbers(numbers,order);

	}

public static void orderNumbers(int[]numbers, String order)  {
		
		
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
