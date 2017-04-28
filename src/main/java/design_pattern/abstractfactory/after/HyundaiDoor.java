package design_pattern.abstractfactory.after;

public class HyundaiDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("CLOSE %s Door%n", "HYUNDAI");
	}

	@Override
	protected void doOpen() {
		System.out.printf("OPEN %s Door%n", "HYUNDAI");
	}
}
