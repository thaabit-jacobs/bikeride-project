package bicycles;

public abstract class BicycleBase implements Bicycle{
	
	private int speed;
	
	protected void changeSpeed(int amount) {
		speed += amount;
	}
	
	public int currentSpeed() {
		return speed;
	}
	
	public void stop() {
		speed = 0;
	}
	
}
