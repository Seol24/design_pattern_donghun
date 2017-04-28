package design_pattern.abstractfactory.after;

public class Client {
	public static void main(String[] args) {
		/*###############문################*/
		ElevatorFactory doorFactory = null;
		String doorVendorName = String.valueOf(VendorID.LG);
		
		
		if(doorVendorName.equalsIgnoreCase("LG"))
			doorFactory = LGElevatorFactory.getInstance();
		else if(doorVendorName.equalsIgnoreCase("Samsung"))
			doorFactory = SamsungElevatorFactory.getInstance();
		else
			doorFactory = HyundaiElevatorFactory.getInstance();
		
		/*##################모터################*/
		ElevatorFactory motorFactory =null;
		String motorVendorName = String.valueOf(VendorID.SAMSUNG);
		
		if(motorVendorName.equalsIgnoreCase("LG"))
			motorFactory = LGElevatorFactory.getInstance();
		else if(motorVendorName.equalsIgnoreCase("Samsung"))
			motorFactory = SamsungElevatorFactory.getInstance();
		else
			motorFactory = HyundaiElevatorFactory.getInstance();
		
		/*#######################################*/
		Door door = doorFactory.createDoor();
		Motor motor = motorFactory.createMotor();
		motor.setDoor(door);
		
		door.open();
		motor.move(Direction.UP);
		}
}
