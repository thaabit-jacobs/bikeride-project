package rides;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideTwo;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;

public class RideTwoTest {
	
	@Test
	public void RideTwoTestMountainBike() {
		MountainBike mb = new MountainBike();
		BikeRideTwo brt = new BikeRideTwo(mb);	
		brt.ride(mb);
		assertEquals(15, mb.currentSpeed());
	   }
	 
	 @Test
	 public void RideTwoTestRoadBike() {
		 RoadBike rb = new RoadBike();
		 BikeRideTwo brt = new BikeRideTwo(rb);	
		 brt.ride(rb);
		 assertEquals(46, rb.currentSpeed());
	   }
	 
	 @Test
	 public void RideTwoTestTandem() {
		Tandem t = new Tandem();
		BikeRideTwo brt = new BikeRideTwo(t);	
		brt.ride(t);
		assertEquals(37, t.currentSpeed());
	  }
	 
	 @Test
	 public void bikeSpecRideTwoRoadBike() {
		BicycleSpecification roadb = new BicycleSpecification(BicycleType.ROAD_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(roadb);
		BikeRideTwo bikeride = new BikeRideTwo(bikespec);
			
		bikeride.ride(bikespec);
			
	    assertEquals(46, bikeride.getCurrentSpeed());
	 }
		
	@Test
	public void bikeSpecRideTwoMountainbike() {
		BicycleSpecification mountainb = new BicycleSpecification(BicycleType.MOUNTAIN_BIKE);
		BicycleFromSpec bikespec = new BicycleFromSpec(mountainb);
		BikeRideTwo bikeride = new BikeRideTwo(bikespec);
			
		bikeride.ride(bikespec);
			
	    assertEquals(15, bikeride.getCurrentSpeed());
	 }
		
	@Test
	public void bikeSpecRideTwoTandem() {
		BicycleSpecification tandemb = new BicycleSpecification(BicycleType.TANDEM);
		BicycleFromSpec bikespec = new BicycleFromSpec(tandemb);
		BikeRideTwo bikeride = new BikeRideTwo(bikespec);
			
		bikeride.ride(bikespec);
			
	    assertEquals(37, bikeride.getCurrentSpeed());
	}
}
