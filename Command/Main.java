package Command;

public class Main {

	public static void main(String[] args) {
		ICommand command = new StartEngine(new FordHybrid(new Ford()));
		DriverInvoker driver = new DriverInvoker(command);
		driver.run();
	}

}
