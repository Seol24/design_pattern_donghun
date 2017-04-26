package design_pattern.singleton.after;

public class Printer {
	public static Printer printer = null;
	
	public static Printer getPrinter() {
		if(printer == null){
			printer = new Printer();
		}
		return printer;
	}

	public Printer() {}
	
	public void print(String str){
		System.out.println(str);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
	}
}
