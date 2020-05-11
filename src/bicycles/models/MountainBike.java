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
	
	public static void main(String[] args) {
		MountainBike mb = new MountainBike();
		mb.accelerate();
		System.out.println(mb.currentSpeed());
	}
}
