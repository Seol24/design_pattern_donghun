package design_pattern.singleton.after.thread;

public class Printer {
	/*public static Printer printer = new Printer();*/
	public static Printer printer = null;
	private int count;
	
	
	/*public static Printer getPrinter()*/
	public synchronized static Printer getPrinter(){
		if(printer == null){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printer = new Printer();
		}
		return printer;
		
	}

	public Printer() {}
	
	public synchronized void print(String str){
		count++;
		System.out.println(str + " : " +count);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}
}
