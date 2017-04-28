package design_pattern.factory.after;

public interface ElevatorScheduler {
	int selectElevator(ElevatorManager manager, int desination, Direction direction);
}
