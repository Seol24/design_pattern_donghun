package design_pattern.factory.before;

public class Client {
	public static void main(String[] args) {
		ElevatorManager elevatorManager = new ElevatorManager(3);
		
		for(int i=1; i<6; i++){
			elevatorManager.requestElevator(4, Direction.DOWN);
		}
		
	}
}
