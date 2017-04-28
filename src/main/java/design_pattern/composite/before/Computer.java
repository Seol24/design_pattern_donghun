package design_pattern.composite.before;

public class Computer {
	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	
	public void addBody(Body body){
		this.body = body;
	}
	public void addKeyboard(Keyboard keyboard){
		this.keyboard = keyboard;
	}
	public void addMonitor(Monitor monitor){
		this.monitor = monitor;
	}
	
	public int getPower(){
		int bodyPower = body.getPower();
		int keyboardPower = keyboard.getPower();
		int monitorPower = monitor.getPower();
		return bodyPower + keyboardPower + monitorPower;
	}
	public int getPrice(){
		int bodyPrice = body.getPrice();
		int keyboardPrice = keyboard.getPrice();
		int monitorPrice = monitor.getPrice();
		return bodyPrice + keyboardPrice + monitorPrice;
	}
}
