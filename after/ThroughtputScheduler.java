package design_pattern.factory.after;

public class ThroughtputScheduler implements ElevatorScheduler{
	private static final ThroughtputScheduler instance = new ThroughtputScheduler();
	
	private ThroughtputScheduler() {}

	public static ThroughtputScheduler getInstance() {
		return instance;
	}

	@Override
	public int selectElevator(ElevatorManager manager, int desination, Direction direction){
		return (int)(Math.random()*3);
	}

	@Override
	public String toString() {
		return"ThroughtputScheduler" + Integer.toHexString(hashCode());
	}
	
}
