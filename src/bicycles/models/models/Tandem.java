package bicycles.models;

import bicycles.*;

public class Tandem extends BicycleBase{
	
	public void accelerate() {
		changeSpeed(12);
	}
	
	public void brake() {
		changeSpeed(-7);

		if(currentSpeed() <= 0)
			stop();
	}
}
