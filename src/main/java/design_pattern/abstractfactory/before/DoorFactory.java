package design_pattern.abstractfactory.before;

public class DoorFactory {
	public static Door createDoor(VendorID vendorId){
		Door door = null;
		switch (vendorId) {
		case LG:
			door = new LGDoor();
			break;
		case HYUNDAI:
			door = new HyundaiDoor();
			break;
		}
		return door;
	}
}
