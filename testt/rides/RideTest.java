package rides;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import models.*;
import bicycles.*;

public class RideTest {
	
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
	 
	 //
	 @Test
	    public void RideOneTestMutilpleMountainBike() {
			MountainBike mb = new MountainBike();
			BikeRideOne bro = new BikeRideOne(mb);	
			bro.ride(mb);
			bro.ride(mb);
			bro.ride(mb);
			assertEquals(12, mb.currentSpeed());
	    }
	 
	 @Test
	    public void RideOneTestMutilpleRoadBike() {
		 	RoadBike rb = new RoadBike();
			BikeRideOne bro = new BikeRideOne(rb);	
			bro.ride(rb);
			bro.ride(rb);
			bro.ride(rb);
			assertEquals(42, rb.currentSpeed());
	    }
	 
	 @Test
	    public void RideOneTestMutilpleTandem() {
		 	Tandem t = new Tandem();
			BikeRideOne bro = new BikeRideOne(t);	
			bro.ride(t);
			bro.ride(t);
			bro.ride(t);
			assertEquals(30, t.currentSpeed());
	    }
	 
	 ////
	 @Test
	    public void RideTwoTestMountainBike() {
			MountainBike mb = new MountainBike();
			BikeRideOne bro = new BikeRideOne(mb);	
			bro.ride(mb);
			assertEquals(0, mb.currentSpeed());
	    }
	 
	 @Test
	    public void RideTwoTestRoadBike() {
		 	RoadBike rb = new RoadBike();
			BikeRideOne bro = new BikeRideOne(rb);	
			bro.ride(rb);
			assertEquals(0, rb.currentSpeed());
	    }
	 
	 @Test
	    public void RideTwoTestTandem() {
		 	Tandem t = new Tandem();
			BikeRideOne bro = new BikeRideOne(t);	
			bro.ride(t);
			assertEquals(0, t.currentSpeed());
	    }
	 
	 //
	 @Test
	    public void RideTwoTestMutilpleMountainBike() {
			MountainBike mb = new MountainBike();
			BikeRideOne bro = new BikeRideOne(mb);	
			bro.ride(mb);
			bro.ride(mb);
			bro.ride(mb);
			assertEquals(0, mb.currentSpeed());
	    }
	 
	 @Test
	    public void RideTwoTestMutilpleRoadBike() {
		 	RoadBike rb = new RoadBike();
			BikeRideOne bro = new BikeRideOne(rb);	
			bro.ride(rb);
			bro.ride(rb);
			bro.ride(rb);
			assertEquals(0, rb.currentSpeed());
	    }
	 
	 @Test
	    public void RideTwoTestMutilpleTandem() {
		 	Tandem t = new Tandem();
			BikeRideOne bro = new BikeRideOne(t);	
			bro.ride(t);
			bro.ride(t);
			bro.ride(t);
			assertEquals(0, t.currentSpeed());
	    }
	 
	 ///////
	 
	 @Test
	    public void RideThreeTestMountainBike() {
			MountainBike mb = new MountainBike();
			BikeRideOne bro = new BikeRideOne(mb);	
			bro.ride(mb);
			assertEquals(0, mb.currentSpeed());
	    }
	 
	 @Test
	    public void RideThreeTestRoadBike() {
		 	RoadBike rb = new RoadBike();
			BikeRideOne bro = new BikeRideOne(rb);	
			bro.ride(rb);
			assertEquals(0, rb.currentSpeed());
	    }
	 
	 @Test
	    public void RideThreeTestTandem() {
		 	Tandem t = new Tandem();
			BikeRideOne bro = new BikeRideOne(t);	
			bro.ride(t);
			assertEquals(0, t.currentSpeed());
	    }
	 
	 //
	 @Test
	    public void RideThreeTestMutilpleMountainBike() {
			MountainBike mb = new MountainBike();
			BikeRideOne bro = new BikeRideOne(mb);	
			bro.ride(mb);
			bro.ride(mb);
			bro.ride(mb);
			assertEquals(0, mb.currentSpeed());
	    }
	 
	 @Test
	    public void RideThreeTestMutilpleRoadBike() {
		 	RoadBike rb = new RoadBike();
			BikeRideOne bro = new BikeRideOne(rb);	
			bro.ride(rb);
			bro.ride(rb);
			bro.ride(rb);
			assertEquals(0, rb.currentSpeed());
	    }
	 
	 @Test
	    public void RideThreeTestMutilpleTandem() {
		 	Tandem t = new Tandem();
			BikeRideOne bro = new BikeRideOne(t);	
			bro.ride(t);
			bro.ride(t);
			bro.ride(t);
			assertEquals(0, t.currentSpeed());
	    }
	 
	 @Test
	    public void FunRideTest() {
		 	FunRide fr = new FunRide();
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.ROAD_BIKE);
		 	fr.accept(BicycleType.TANDEM);
		 	
			assertEquals(3, fr.getCountForType(BicycleType.MOUNTAIN_BIKE));
	    }
}
