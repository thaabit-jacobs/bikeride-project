package models;

import bicycles.*;

public class Tandem extends BicycleBase{
	
	public void accelerate() {
		changeSpeed(12);
	}
	
	public void brake() {
		if(currentSpeed() < 7) 
			changeSpeed(0);
		else
			changeSpeed(-7);
	}
}
