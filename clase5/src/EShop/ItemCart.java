package EShop;

public class ItemCart {
	private Product product;
	private int quantity;
	
	
	public ItemCart(Product product,int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	
	public String getItemCart() {
		return this.product.getProduct()+" Cantidad: "+this.quantity;
	}
	
	public float getTotal() {
		return this.product.getPrice()*this.quantity;
	}
	
}
