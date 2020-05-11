package bicycles;

import java.util.*;

public class FunRide {
	
	private ArrayList<BicycleType> bicycleList;
	
	FunRide() {
		
		bicycleList = new ArrayList<BicycleType>();
		
		System.out.println("Only five bikes allowed in this ride");
		
	}
	
	void accept(BicycleType bike) {
		if(bicycleList.size() == 5) {
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
}
