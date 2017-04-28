package design_pattern.composite.after;

import design_pattern.composite.before.Mouse;
import design_pattern.composite.before.Speaker;

public class Client {
	public static void main(String[] args) {
		Body body = new Body(80, 100); 
		Keyboard keyboard = new Keyboard(5, 12);
		Monitor monitor = new Monitor(20, 40);
		Speaker speaker = new Speaker(25, 10);
		Mouse mouse = new Mouse(5, 6);
		
		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);
		computer.addComponent(mouse);
		
		
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		System.out.println("Computer Price : " + computerPrice + "만 원");
		System.out.println("Computer Power : " + computerPower + "W");
	}
}

