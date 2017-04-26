package design_pattern.singleton.after.staticmathod;

public class Printer {
	public static int counter = 0;
	public synchronized static void print(String str){
		counter++;
		System.out.println(str+counter);
	}
}
