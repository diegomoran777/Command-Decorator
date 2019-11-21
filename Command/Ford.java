package Command;

public class Ford implements ICar{

	@Override
	public void accelerate() {
		System.out.println("Acelerando...");
	}

	@Override
	public void startEngine() {
		System.out.println("Prendiendo el motor...");
	}

	@Override
	public void stop() {
		System.out.println("Frenando...");
	}
	
}
