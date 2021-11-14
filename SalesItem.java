package Sales;

import java.text.DecimalFormat;

public class SalesItem {

	private String item;
	private double price;
	private int quantity;
	
	public SalesItem(String item, double p, int q) {
		this.item = item;
		this.price = p;
		this.quantity = q;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double performCalculations () {
		return price * quantity;
	}
	
	public String toString() {
		return item + "    $" + price + "    " + quantity;
	}
}
