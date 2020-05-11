package bicycles.models;

import bicycles.*;

public class RoadBike extends BicycleBase{
	
	public void accelerate() {
		changeSpeed(11);
	};
	
	public void brake() {
		changeSpeed(-4);

		if(currentSpeed() <= 0)
			stop();
	};

}
