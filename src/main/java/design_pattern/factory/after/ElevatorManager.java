package design_pattern.factory.after;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulinngStrategyID strategyID;
	
	public ElevatorManager(int controllerCount, SchedulinngStrategyID strategyID){
		controllers = new ArrayList<>();
		for(int i=0; i<controllerCount; i++){
			controllers.add(new ElevatorController(i));
		}
		this.strategyID = strategyID;
	}
	
	
	
	public void setStrategyID(SchedulinngStrategyID strategyID) {
		this.strategyID = strategyID;
	}



	void requestElevator(int destination, Direction direction){
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectElevator).gotoFloor(destination);
	}
}
