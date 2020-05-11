package models;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ModelsTest {
	
	@Test
    public void shouldAccellerateMountainBike() {
		MountainBike mb = new MountainBike();
		mb.accelerate();
        assertEquals(5, mb.currentSpeed());
    }
	
	@Test
    public void shouldAccellerateMutipleMountainBike() {
		MountainBike mb = new MountainBike();
		mb.accelerate();
		mb.accelerate();
        assertEquals(10, mb.currentSpeed());
    }
	
	@Test
    public void shouldAccellerateAndBrakeMountainBike() {
		MountainBike mb = new MountainBike();
		mb.accelerate();
		mb.brake();
        assertEquals(2 , mb.currentSpeed());
    }
	
	@Test
    public void shouldAccellerateAndBrakeMutipleMountainBike() {
		MountainBike mb = new MountainBike();
		mb.accelerate();
		mb.accelerate();
		mb.brake();
		mb.brake();
        assertEquals(4, mb.currentSpeed());
    }
	
	//
	@Test
    public void shouldAccellerateRoadBike() {
		RoadBike rb = new RoadBike();
		rb.accelerate();
        assertEquals(11, rb.currentSpeed());
    }
	
	@Test
    public void shouldAccellerateMutipleRoadBike() {
		RoadBike rb = new RoadBike();
		rb.accelerate();
		rb.accelerate();
        assertEquals(22, rb.currentSpeed());
    }
    
    @Test
    public void shouldAccellerateAndBrakeRoadBike() {
    	RoadBike rb = new RoadBike();
    	rb.accelerate();
    	rb.brake();
        assertEquals(7, rb.currentSpeed());
    }
    
    @Test
    public void shouldAccellerateAndBrakeMutipleRoadBike() {
    	RoadBike rb = new RoadBike();
    	rb.accelerate();
    	rb.accelerate();
		rb.brake();
		rb.brake();
        assertEquals(14, rb.currentSpeed());
    }
    
    //
    @Test
    public void shouldAccellerateTandem() {
    	Tandem t = new Tandem();
		t.accelerate();
        assertEquals(12, t.currentSpeed());
    }
	
	@Test
    public void shouldAccellerateMutipleTandem() {
		Tandem t = new Tandem();
		t.accelerate();
		t.accelerate();
        assertEquals(24, t.currentSpeed());
    }
    
    @Test
    public void shouldAccellerateAndBrakeTandem() {
    	Tandem t = new Tandem();
    	t.accelerate();
    	t.brake();
        assertEquals(5, t.currentSpeed());
    }
    
    @Test
    public void shouldAccellerateAndBrakeMutipleTandem() {
    	Tandem t = new Tandem();
    	t.accelerate();
    	t.accelerate();
		t.brake();
		t.brake();
        assertEquals(10, t.currentSpeed());
    }
}
