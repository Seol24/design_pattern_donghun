package design_pattern.template.before;

public class Client {

	public static void main(String[] args) {
		Door hDoor = new Door();
		Motor hMotor = new HyundaiMotor(hDoor);
		System.out.println(hMotor);
		hMotor.move(Direction.UP);
		System.out.println();
		System.out.println(hMotor);
		
		
		Door lDoor = new Door();
		Motor LgMotor = new LgMotor(lDoor);
		System.out.println(LgMotor);
		LgMotor.move(Direction.UP);
		System.out.println();
		System.out.println(LgMotor);
	}

}
