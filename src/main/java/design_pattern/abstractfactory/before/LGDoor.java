package design_pattern.abstractfactory.before;

public class LGDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("CLOSE %s Door%n", "LG");
	}

	@Override
	protected void doOpen() {
		System.out.printf("OPEN %s Door%n", "LG");

	}

}
