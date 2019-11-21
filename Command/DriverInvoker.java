package Command;

public class DriverInvoker {
	private ICommand command;
	
	public DriverInvoker(ICommand command) {
		this.command = command;
	}
	
	public void run() {
		this.command.execute();
	}
}
