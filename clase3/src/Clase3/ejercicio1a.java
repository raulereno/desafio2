
package Clase3;

public class ejercicio1a {
	 public static void main(String[] args) throws Exception {
	     String letters ="dnsfazfancdf";  
		 char letter = 'f';
		 int counter = 0; 
		 
		 for(int i = 0;i< letters.length();i++) {
			 if(letter == letters.charAt(i)) {
				 counter++;
			 }
		 }
	        System.out.println(counter);
	    }
}
