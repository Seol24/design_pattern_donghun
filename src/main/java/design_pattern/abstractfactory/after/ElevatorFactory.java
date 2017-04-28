package design_pattern.abstractfactory.after;

public abstract class ElevatorFactory {
	public static ElevatorFactory getFactory(VendorID vendorId){
		ElevatorFactory factory = null;
		switch (vendorId) {
		case LG:
			factory = LGElevatorFactory.getInstance();
			break;
		case SAMSUNG:
			factory = SamsungElevatorFactory.getInstance();
			break;
		case HYUNDAI:
			factory = HyundaiElevatorFactory.getInstance();
			break;
		}
		return factory;
	}
	public abstract Motor createMotor();
	public abstract Door createDoor();
}
