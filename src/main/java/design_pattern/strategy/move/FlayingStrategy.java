package design_pattern.strategy.move;

public class FlayingStrategy implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("I can fly");
	}

}
