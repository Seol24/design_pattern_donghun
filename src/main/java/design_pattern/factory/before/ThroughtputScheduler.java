package design_pattern.factory.before;

public class ThroughtputScheduler {
	public int selectElevator(ElevatorManager manager, int desination, Direction direction){
		return (int)(Math.random()*3);
	}
	
}
