package Command;

public class Accelerate implements ICommand{
	private ICar car;
	
	public Accelerate(ICar car) {
		this.car = car;
	}

	@Override
	public void execute() {
		this.car.accelerate();
	}
}
