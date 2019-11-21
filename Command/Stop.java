package Command;

public class Stop implements ICommand{
	private ICar car;
	
	public Stop(ICar car) {
		this.car = car;
	}

	@Override
	public void execute() {
		this.car.stop();
	}
}
