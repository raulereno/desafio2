package instance;

import java.time.LocalDateTime;

import EShop.Cart;
import EShop.ItemCart;
import EShop.Person;
import EShop.Product;

public class InstaceCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime born = LocalDateTime.of(1997,8 , 26, 0 , 0);
		
		Person person = new Person("Raul","Ereno",born);
		Product product1 = new Product("Teclado","tcl",9000); 
		Product product2 = new Product("Mouse","ms",3000); 
		Product product3 = new Product("Monitor","mntr",5000);
		
		ItemCart itemCart1 = new ItemCart(product1, 1);
		ItemCart itemCart2 = new ItemCart(product2, 3);
		ItemCart itemCart3 = new ItemCart(product3, 2);
		
		Cart cart = new Cart(itemCart1,itemCart2,itemCart3,person);
		
		cart.getAllCart();
		
	}

}
