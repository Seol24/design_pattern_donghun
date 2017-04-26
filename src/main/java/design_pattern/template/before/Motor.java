package design_pattern.template.before;

public abstract class Motor {
	protected Door door;
	private MotorStatus motorstatus;
	
	public Motor(Door door) {
		this.door = door;
		this.motorstatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorstatus() {
		return motorstatus;
	}

	protected void setMotorstatus(MotorStatus motorstatus) {
		this.motorstatus = motorstatus;
	}
	
	@Override
	public String toString() {
		String motorStatus = getMotorstatus()==MotorStatus.MOVING?"이동 중":"중지";
		String doorStatus = door.getDoorStatus()==DoorStatus.OPENED?"문 열림":"문 닫힘";
		return String.format("모터 상태 : %s 문의 상태 : %s %n", motorStatus, doorStatus);
	}
	
	public void move(Direction direction){//template method
		MotorStatus motorStatus = getMotorstatus();
		if(motorStatus==MotorStatus.MOVING){
			return;
		}
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus==DoorStatus.OPENED){
			door.close();
		}
		
		moveMotor(direction);//hook method
		setMotorstatus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor(Direction direction);

	
	
}
