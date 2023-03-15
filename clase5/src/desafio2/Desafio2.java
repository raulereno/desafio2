package desafio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import EShop.Cart;
import EShop.ItemCart;
import EShop.Person;
import EShop.Product;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime born = LocalDateTime.of(1997,8 , 26, 0 , 0);
		Person person = new Person("Raul","Ereno",born);
		
		Path file = Paths.get("files/cart.txt");
		List<String> lines;
		
		try {
			lines = Files.readAllLines(file.toAbsolutePath());
			
			ItemCart items[] = new ItemCart[lines.size()];
			int aux = 0;
			
			for(String line : lines) {
				
				String colums[]= line.split(";");
										
				Product product = new Product(colums[2],colums[3],Float.parseFloat(colums[1]));
				ItemCart itemCart = new ItemCart(product, Integer.parseInt(colums[0]));				
					
				items[aux]= itemCart;
					
				System.out.println(itemCart.getItemCart());
				
				aux++;	
			}
			
			Cart cart = new Cart(items[0],items[1],items[2],person);
			
			System.out.println("El precio total del carrito es: $"+cart.getTotalInCart());
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}

}
