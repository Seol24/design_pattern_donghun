package design_pattern.strategy.attack;

public class RazerStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("눈에서 레이저가~~~!!!");
	}

}
