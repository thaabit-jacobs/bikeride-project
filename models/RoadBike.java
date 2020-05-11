package models;

import bicycles.*;

public class RoadBike extends BicycleBase{
	
	public void accelerate() {
		changeSpeed(11);
	};
	
	public void brake() {
		if(currentSpeed() < 4)
			changeSpeed(0);
		else
			changeSpeed(-4);
	};

}
