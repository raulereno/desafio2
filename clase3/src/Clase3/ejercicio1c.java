package Clase3;

public class ejercicio1c {
	public static void main(String[] args) throws Exception {
		
		int arr[] = {2,3,1,1,6,4,8,2,3};
		int counter = 0;
		int x = 5;
		
		for(int i=0;i <= arr.length-1;i++) {
			if(arr[i] > x) {
				counter += arr[i];
			}
		}
		System.out.println(counter);
	}
}
