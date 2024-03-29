package command;

import geometry.Rectangle;

public class ModifyRectangleCmd implements Command{

	private Rectangle oldState;
	private Rectangle newState;
	private Rectangle original = new Rectangle();

	public ModifyRectangleCmd(Rectangle oldState, Rectangle newState) {
		this.oldState = oldState;
		this.newState = newState;
	}

	@Override
	public void execute() {
		original = oldState.clone(original);
		oldState = newState.clone(oldState);
		
	}

	@Override
	public void unexecute() {
		oldState = original.clone(oldState);
		
	}
	
	@Override
	public String toString() {
		return "Modify: " + original + " to "+ newState +  "\n";
	}

}
