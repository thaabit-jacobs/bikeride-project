package specification;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import bicycles.BicycleType;
import bicycles.specifications.*;
import bicycles.rides.*;

public class SpecificationTest {
	
    @Test
    public void bikeSpecNameRoadbike() {
	BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);

        assertEquals(true, "Road bike".equals(roadb.getBikeType().getBikeName()));
    }
	
    @Test
    public void bikeSpecNameMountainbike() {
	BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);
	
        assertEquals(true, "MountainBike".equals(mountainb.getBikeType().getBikeName()));
    }
	
    @Test
    public void bikeSpecNameTandem() {
	BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
	
        assertEquals(true, "Tandem".equals(tandemb.getBikeType().getBikeName()));
    }
	
	
    @Test
    public void bikeSpecSpeedRoadbike() {
	BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
	
        assertEquals(11, roadb.getBikeType().getAccelerationSpeed());
    }
	
    @Test
    public void bikeSpecSpeedMountainbike() {
	BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);

        assertEquals(5, mountainb.getBikeType().getAccelerationSpeed());
    }
	
    @Test
    public void bikeSpecSpeedTandem() {
	BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		
        assertEquals(12, tandemb.getBikeType().getAccelerationSpeed());
    }
	

	
    @Test
    public void bikeSpecBrakeRoadbike() {
	BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
	
        assertEquals(4, roadb.getBikeType().getBrakeSpeed());
    }
	
    @Test
    public void bikeSpecBrakeMountainbike() {
	BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);

        assertEquals(3, mountainb.getBikeType().getBrakeSpeed());
    }
	
    @Test
    public void bikeSpecBrakeTandem() {
	BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		
        assertEquals(7, tandemb.getBikeType().getBrakeSpeed());
    }
	
}
