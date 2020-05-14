package rides;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.FunRide;

public class FunRideTest {
	
	@Test
    public void FunRideTestBikeTypeCount() {
	 	FunRide fr = new FunRide(5);
	 	fr.accept(new MountainBike());
	 	fr.accept(new MountainBike());
	 	fr.accept(new MountainBike());
	 	fr.accept(new RoadBike());
	 	fr.accept(new Tandem());
	 	
		assertEquals(3, fr.getCountForType(BicycleType.MOUNTAIN_BIKE));
    }
 
	@Test
    public void FunRideTestNumBikeEntered() {
	 	FunRide fr = new FunRide(5);
	 	fr.accept(new MountainBike());
	 	fr.accept(new RoadBike());
	 	fr.accept(new Tandem());
	 	
		assertEquals(3, fr.getEnteredCount());
    }
}
