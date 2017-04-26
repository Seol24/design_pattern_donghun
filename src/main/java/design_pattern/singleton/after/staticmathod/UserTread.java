package design_pattern.singleton.after.staticmathod;

public class UserTread extends Thread{
	public UserTread(String name){
		super(name);
	}
	public void run(){
		Printer.print(Thread.currentThread().getName()+" print using " + ": ");
	}
}
