package rides;

import bicycles.*;

public class BikeRideTwo implements BikeRide{
	
	private Bicycle bike;
	
	public BikeRideTwo(Bicycle bike) {
		
		this.bike = bike;
		
	}
	
	 public void ride(Bicycle bike) {
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.brake();
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.brake();
		 this.bike.accelerate();
		 this.bike.accelerate();
		 this.bike.brake();
		 this.bike.stop();
	 }
	
	public int getCurrentSpeed() {
		return bike.currentSpeed();
	}
	
}
