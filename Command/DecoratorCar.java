package Command;

public abstract class DecoratorCar implements ICar{
	private ICar car;
	
	public DecoratorCar(ICar car) {
		this.car = car;
	}

	protected ICar getCar() {
		return this.car;
	}
}
