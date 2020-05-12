package rides;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import bicycles.models.*;
import bicycles.rides.*;
import bicycles.BicycleType;

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
	
	 
	 @Test
	    public void FunRideTestBikeTypeCount() {
		 	FunRide fr = new FunRide(5);
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.ROAD_BIKE);
		 	fr.accept(BicycleType.TANDEM);
		 	
			assertEquals(3, fr.getCountForType(BicycleType.MOUNTAIN_BIKE));
	    }
	 
	 @Test
	    public void FunRideTestNumBikeEntered() {
		 	FunRide fr = new FunRide(5);
		 	fr.accept(BicycleType.MOUNTAIN_BIKE);
		 	fr.accept(BicycleType.ROAD_BIKE);
		 	fr.accept(BicycleType.TANDEM);
		 	
			assertEquals(3, fr.getEnteredCount());
	    }
}
