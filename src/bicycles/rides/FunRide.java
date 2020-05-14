package bicycles.rides;

import java.util.ArrayList;

import bicycles.*;


public class FunRide {
	
	private ArrayList<Bicycle> bicycleList;
	private int numOfBikes;
	
	public FunRide(int numOfBikes) {
		
		bicycleList = new ArrayList<Bicycle>();
		
		this.numOfBikes = numOfBikes;
		
	}
	
	public void accept(Bicycle bike) {
		if(bicycleList.size() == numOfBikes) {
			System.out.println("Fun ride full");
		} else
			bicycleList.add(bike);
	}
	
	public int getCountForType(BicycleType bike) {
		int count = 0;
		
		for(Bicycle b: bicycleList) {
			b.accelerate();
			if(b.currentSpeed() == bike.getAccelerationSpeed()) 
				count++;
		}
		
		return count;
	}
	
	public int getEnteredCount() {
		return bicycleList.size();
	}
	
}
