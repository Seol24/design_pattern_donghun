package design_pattern.factory.after;

public class Client {
	public static void main(String[] args) {
		ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(3, SchedulinngStrategyID.RESPONSE_TIME);
		emWithResponseTimeScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithThroughtputScheduler = new ElevatorManager(3, SchedulinngStrategyID.THROUGHPUT);
		emWithThroughtputScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithDynamicScheduler = new ElevatorManager(3, SchedulinngStrategyID.DYNAMIC);
		emWithDynamicScheduler.requestElevator(10, Direction.UP);
		
		ElevatorManager emWithThroughtputScheduler2 = new ElevatorManager(3, SchedulinngStrategyID.THROUGHPUT);
		emWithThroughtputScheduler2.requestElevator(10, Direction.UP);
		
	}
}
