package EShop;

public class Descuento {
	private int percentage;
	private float total;
	
	
	public Descuento(int percentage, float total){
		this.percentage = percentage;
		this.total = total;
	}
	
	public int calculateDiscount() {
		
		int discount = (int) ((this.total*this.percentage)/100);
		
		return (int)(this.total-discount);
	}
	
}
