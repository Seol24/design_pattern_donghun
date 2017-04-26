package design_pattern.singleton.after.thread;

public class UserThread extends Thread{
	public UserThread(String name){
		super(name);
	}
	
	@Override
	public void run(){
		Printer prn = Printer.getPrinter();
		String str = String.format(
				"%s print using %s", 
				Thread.currentThread().getName(), 
				prn.toString()
				);
		prn.print(str);
	} 
}
