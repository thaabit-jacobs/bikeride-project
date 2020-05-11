package rides;

import bicycles.*;

class BikeRideOne implements BikeRide{
	
	private Bicycle bike;
	
	BikeRideOne(Bicycle bike) {
		
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