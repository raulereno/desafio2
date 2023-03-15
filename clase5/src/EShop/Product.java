package EShop;

public class Product {
	private String name;
	private String code;
	private float price;
	
	
	public Product(String name, String code, float price){
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	public String getProduct() {
		return "Nombre: "+this.getName()+" Precio: $"+this.getPrice();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setCode(String code) {
		this.code=code;
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	
	
}
