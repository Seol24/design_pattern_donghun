package design_pattern.abstractfactory.after;

public class MotorFactory {
	public static Motor createMotor(VendorID vendorId){
		Motor motor = null;
		switch(vendorId){
		case LG:
			motor = new LGMotor();
			break;
		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}
