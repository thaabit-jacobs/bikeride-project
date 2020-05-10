package models;

import bicycles.*;

public class MountainBike extends BicycleBase{
	
	public void accelerate() {
		changeSpeed(5);
	};
	
	public void brake() {
		if(currentSpeed() < 3)
			changeSpeed(5);
		else
			changeSpeed(-3);
	};

}
