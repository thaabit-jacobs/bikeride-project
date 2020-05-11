package specifications;

import bicycles.*;

public class BicycleSpecification {

	private BicycleType bikeType;
	
	public BicycleSpecification(BicycleType bikeType) {
		
		this.bikeType = bikeType;
		
	}
	
	public BicycleType getBikeType() {
		return bikeType;
	}
}
