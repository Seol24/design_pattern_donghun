package design_pattern.state.before;

public class Light {
	private static final int on = 0;
	private static final int off= 1;
	private static final int sleeping = 2;
	
	
	private int state;
	public Light(){
		state = Light.off;
	}
	public void on_button_pushed(){
		if(state == Light.on){
			System.out.println("취침 모드");
			state = Light.sleeping;
		}else if(state == Light.sleeping){
			System.out.println("Light On");
			state = Light.on;
		}
		else{
			System.out.println("Light On");
			state = Light.on;
		}
	}
	public void off_button_pushed(){
		if(state == Light.off){
			System.out.println("반응 없음");
		}else if(state == Light.sleeping){
			System.out.println("Light Off");
			state = Light.off;
		}
		else{
			System.out.println("Light Off");
			state = Light.off;
		}
	}
}
