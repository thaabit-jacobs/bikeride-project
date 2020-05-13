package rides;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import bicycles.BicycleType;
import bicycles.rides.FunRide;

public class FunRideTest {
	
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
