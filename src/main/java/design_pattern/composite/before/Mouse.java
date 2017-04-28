package design_pattern.composite.before;

import design_pattern.composite.after.ComputerDevice;

public class Mouse extends ComputerDevice {
	private int price;
	private int power;
	
	

	public Mouse(int power,int price) {
		this.price = price;
		this.power = power;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getPower() {
		return power;
	}

}
