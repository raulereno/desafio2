package EShop;

public class Cart {
	private ItemCart itemCarrito1;
	private ItemCart itemCarrito2;
	private ItemCart itemCarrito3;
	private Person person;	
	private Descuento discount;
	
	public Cart(ItemCart itemCarrito1,ItemCart itemCarrito2,ItemCart itemCarrito3,Person person) {
		this.itemCarrito1= itemCarrito1;
		this.itemCarrito2= itemCarrito2;
		this.itemCarrito3= itemCarrito3;
		this.discount = new Descuento(20, this.getTotalInCart());
		this.person = person;
	}
	
	
	
	public float getTotalInCart() {
		return itemCarrito1.getTotal()+itemCarrito2.getTotal()+itemCarrito3.getTotal();
	}
	
	public void getAllCart() {
		System.out.println("Productos en carrito:");
		System.out.println("1. "+itemCarrito1.getItemCart());
		System.out.println("2. "+itemCarrito2.getItemCart());
		System.out.println("3. "+itemCarrito3.getItemCart());
		System.out.println("Total:$"+discount.calculateDiscount());
		System.out.println("Persona: "+person.getFullName());
	}
}
