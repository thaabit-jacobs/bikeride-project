package bicycles;

enum BicycleType {
	ROAD_BIKE("Road bike", 11, 4),
	MOUNTAIN_BIKE("MountainBike", 5, 3),
	TANDEM("Tandem", 12, 7);
	
	private String bikeName;
	private int accelerationSpeed;
	private int brakeSpeed;
	
	BicycleType(String bikeName, int accelerationSpeed, int brakeSpeed) {
		
		this.bikeName = bikeName;
		this.accelerationSpeed = accelerationSpeed;
		this.brakeSpeed = brakeSpeed;
		
	}
	
	String getBikeName() {
		return bikeName;
	}
	
	int getAccelerationSpeed() {
		return accelerationSpeed;
	}
	
	int getBrakeSpeed() {
		return brakeSpeed;
	}
}
