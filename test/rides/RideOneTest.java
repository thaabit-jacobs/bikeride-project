package rides;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import bicycles.BicycleType;
import bicycles.models.*;
import bicycles.rides.BikeRideOne;
import bicycles.specifications.*;


public class RideOneTest {
	
    @Test
    public void RideOneTestMountainBike() {
	MountainBike mb = new MountainBike();
	BikeRideOne bro = new BikeRideOne(mb);	
	bro.ride(mb);
	assertEquals(4, mb.currentSpeed());
    }
 
    @Test
    public void RideOneTestRoadBike() {
	RoadBike rb = new RoadBike();
	BikeRideOne bro = new BikeRideOne(rb);	
	bro.ride(rb);
	assertEquals(14, rb.currentSpeed());
    }
 
    @Test
    public void RideOneTestTandem() {
	Tandem t = new Tandem();
	BikeRideOne bro = new BikeRideOne(t);	
	bro.ride(t);
	assertEquals(10, t.currentSpeed());
    }
	
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
}
