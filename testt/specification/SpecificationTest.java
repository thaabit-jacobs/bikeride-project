package specification;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import bicycles.BicycleType;
import specifications.*;
import rides.*;

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
	
	//
	@Test
    public void bikeSpecSpeedRoadbike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
	
        assertEquals(11, roadb.getBikeType().getBikeName());
    }
	
	@Test
    public void bikeSpecSpeedMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);

        assertEquals(5, mountainb.getBikeType().getBikeName());
    }
	
	@Test
    public void bikeSpecSpeedTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		
        assertEquals(12, tandemb.getBikeType().getBikeName());
    }
	
	//////
	
	@Test
    public void bikeSpecBrakeRoadbike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
	
        assertEquals(4, roadb.getBikeType().getBikeName());
    }
	
	@Test
    public void bikeSpecBrakeMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);

        assertEquals(3, mountainb.getBikeType().getBikeName());
    }
	
	@Test
    public void bikeSpecBrakeTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		
        assertEquals(7, tandemb.getBikeType().getBikeName());
    }
	
	////////
	@Test
    public void bikeSpecRideRoadBike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(roadb);
		BikeRideOne bikeride = new BikeRideOne(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(14, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(mountainb);
		BikeRideOne bikeride = new BikeRideOne(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(4, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		BicycleFromSpec bikespec = new BicycleFromSpec(tandemb);
		BikeRideOne bikeride = new BikeRideOne(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(10, bikeride.getCurrentSpeed());
    }
	
	//////
	@Test
    public void bikeSpecRideTwoRoadBike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(roadb);
		BikeRideTwo bikeride = new BikeRideTwo(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(0, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideTwoMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(mountainb);
		BikeRideTwo bikeride = new BikeRideTwo(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(0, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideTwoTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		BicycleFromSpec bikespec = new BicycleFromSpec(tandemb);
		BikeRideTwo bikeride = new BikeRideTwo(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(0, bikeride.getCurrentSpeed());
    }
	
	///////////
	
	@Test
    public void bikeSpecRideThreeRoadBike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(roadb);
		BikeRideThree bikeride = new BikeRideThree(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(0, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideThreeMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(mountainb);
		BikeRideThree bikeride = new BikeRideThree(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(0, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideThreeTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		BicycleFromSpec bikespec = new BicycleFromSpec(tandemb);
		BikeRideThree bikeride = new BikeRideThree(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(0, bikeride.getCurrentSpeed());
    }
}
