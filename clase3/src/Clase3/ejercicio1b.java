package Clase3;

import java.util.*;


public class ejercicio1b {
	public static void main(String[] args) throws Exception {
			int arr[] = {2,3,1};
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
			boolean condicion = true;
			
			while(condicion) {
				condicion = false;
			
				for(int i = 0 ;i < arr.length - 1 ;i++) {
					int aux = arr[i];
					if(aux < arr[i+1]) {
						arr[i]= arr[i+1];
						arr[i + 1]= aux;
						condicion=true;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
	}
}
