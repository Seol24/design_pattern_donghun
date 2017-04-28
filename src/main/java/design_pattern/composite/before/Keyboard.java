package design_pattern.composite.before;

public class Keyboard {
	private int price;
	private int power;
	
	public Keyboard(int power,int price) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPower() {
		return power;
	}
	
	
}
