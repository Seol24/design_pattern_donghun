package design_pattern.command.lamp.before;

public class Button {
	private Command theCommand;
	
	public Button(Command theCommand){
		setCommand(theCommand);
	}

	void setCommand(Command newCommand) {
		this.theCommand = newCommand;
	}
	public void pressed(){
		theCommand.execute();
	}
}
