package design_pattern.ch03;

import org.junit.Test;

import design_pattern.strategy.Atom;
import design_pattern.strategy.Robot;
import design_pattern.strategy.Sungard;
import design_pattern.strategy.TaekwonV;
import design_pattern.strategy.attack.MissileStrategy;
import design_pattern.strategy.attack.PunchStrategy;
import design_pattern.strategy.attack.RazerStrategy;
import design_pattern.strategy.move.FlayingStrategy;
import design_pattern.strategy.move.WalkingStrategy;

public class TestStrategy {

	@Test
	public void test() {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		Robot sunGurd = new Sungard("SunGard");
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
		
		atom.setMovingStrategy(new FlayingStrategy());
		atom.setAttackStrategy(new MissileStrategy());
		
		sunGurd.setMovingStrategy(new FlayingStrategy());
		sunGurd.setAttackStrategy(new MissileStrategy());
		sunGurd.setAttackStrategy(new RazerStrategy());
		
		prnRobot(taekwonV);
		prnRobot(atom);
		prnRobot(sunGurd);
	}

	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
	}

}
