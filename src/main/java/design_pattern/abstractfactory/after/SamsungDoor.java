package design_pattern.abstractfactory.after;

public class SamsungDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("CLOSE %s Door%n", "SAMSUNG");
	}

	@Override
	protected void doOpen() {
		System.out.printf("OPEN %s Door%n", "SAMSUNG");
	}
}
