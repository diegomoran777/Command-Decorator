package Command;

public class FordHybrid extends DecoratorCar{
	
	public FordHybrid(ICar car) {
		super(car);
	}

	@Override
	public void accelerate() {
		getCar().accelerate();
		System.out.println("Acelerando si combustible...");
	}

	@Override
	public void startEngine() {
		getCar().startEngine();
		System.out.println("Encendiendo electricamente...");
	}

	@Override
	public void stop() {
		getCar().stop();
		System.out.println("Frenos electricos..");
	}

	
}
