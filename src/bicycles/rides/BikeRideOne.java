package rides;

import bicycles.*;
import models.MountainBike; //delete

public class BikeRideOne implements BikeRide{
	
	private Bicycle bike;
	
	public BikeRideOne(Bicycle bike) {
		
		this.bike = bike;
		
	}
	
	 public void ride(Bicycle bike) {
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.stop();
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.brake();
		 this.bike.brake();
	 }
	
	public int getCurrentSpeed() {
		return bike.currentSpeed();
	}
}