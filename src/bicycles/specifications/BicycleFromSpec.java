package bicycles.specifications;

import bicycles.*;

public class BicycleFromSpec extends BicycleBase{
	
	private BicycleSpecification bikeSpec;
	
	public BicycleFromSpec(BicycleSpecification bikeSpec) {
		
		this.bikeSpec = bikeSpec;
		
	}
	
	public void accelerate() {
		changeSpeed(bikeSpec.getBikeType().getAccelerationSpeed());
	};
	
	public void brake() {
		changeSpeed(-bikeSpec.getBikeType().getBrakeSpeed());
	};
	
	
}
