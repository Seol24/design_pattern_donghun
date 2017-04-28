package design_pattern.abstractfactory.before;


public class HyundaiMotor extends Motor {

	@Override
	protected void moveMotor(Direction direction) {
		String strDirection = direction == Direction.UP?"위로":"아래로";
		System.out.printf("%s 모터%s로 이동 중...","Hyundai", strDirection);
	}

}
