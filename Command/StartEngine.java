package Command;

public class StartEngine implements ICommand{
	private ICar car;
	
	public StartEngine(ICar car) {
		this.car = car;
	}

	@Override
	public void execute() {
		this.car.startEngine();
	}
}
