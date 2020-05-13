package rides;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideThree;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;

public class RideThreeTest {
	
	@Test
    public void RideThreeTestMountainBike() {
		MountainBike mb = new MountainBike();
		BikeRideThree brt = new BikeRideThree(mb);	
		brt.ride(mb);
		assertEquals(36, mb.currentSpeed());
    }
 
	@Test
    public void RideThreeTestRoadBike() {
	 	RoadBike rb = new RoadBike();
		BikeRideThree brt = new BikeRideThree(rb);	
		brt.ride(rb);
		assertEquals(87, rb.currentSpeed());
    }
 
	@Test
    public void RideThreeTestTandem() {
	 	Tandem t = new Tandem();
	 	BikeRideThree brt = new BikeRideThree(t);	
	 	brt.ride(t);
		assertEquals(87, t.currentSpeed());
    }
	
	@Test
    public void bikeSpecRideThreeRoadBike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(roadb);
		BikeRideThree bikeride = new BikeRideThree(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(87, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideThreeMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(mountainb);
		BikeRideThree bikeride = new BikeRideThree(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(36, bikeride.getCurrentSpeed());
    }
	
	@Test
    public void bikeSpecRideThreeTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		BicycleFromSpec bikespec = new BicycleFromSpec(tandemb);
		BikeRideThree bikeride = new BikeRideThree(bikespec);
		
		bikeride.ride(bikespec);
		
        assertEquals(87, bikeride.getCurrentSpeed());
    }
}
