package bicycles.rides;

import bicycles.*;
import java.util.*;

public class FunRide {
	
	private ArrayList<BicycleType> bicycleList;
	private int numOfBikes;
	
	FunRide(int numOfBikes) {
		
		bicycleList = new ArrayList<BicycleType>();
		
		this.numOfBikes = numOfBikes;
		
	}
	
	void accept(BicycleType bike) {
		if(bicycleList.size() == numOfBikes) {
			System.out.println("Fun ride full");
		} else
			bicycleList.add(bike);
	}
	
	int getCountForType(BicycleType bike) {
		int count = 0;
		
		for(BicycleType b: bicycleList) {
			if(b.getBikeName().equals(bike.getBikeName())) count++;
		}
		
		return count;
	}
	
	int getEnteredCount() {
		return bicycleList.size();
	}
	
}
