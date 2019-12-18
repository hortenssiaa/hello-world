package exercise;

import java.util.*;

public class RegionInfoEx10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> locationInfo = new HashMap<String, Location>();
		
		System.out.println("** You Need To Write 5 Places Information. **");
		for(int i=0; i<5; i++){
			System.out.println("["+(i+1)+"] Place Information");
			System.out.print("Place Name >> ");
			String place = sc.next();
			System.out.print("Latitude(위도) >> ");
			String latitude = sc.next();
			System.out.print("Longitude(경도) >> ");
			String longitude = sc.next();
			System.out.println();
			
			locationInfo.put(place, new Location(place, latitude, longitude));
		}
		
		while(true){
			System.out.print("Place Name (to look up) >> ");
			String key=sc.next();
		
			Location.lookUpPlace(locationInfo, key);
		}
	}

}

/*
 * Seoul  37.553042 126.988853
 * Beijing 39.915378 116.412525
 * Tokyo 35.717530 139.763338
 * Ottawa 45.432188 -75.701524
 * Pyeongyang 39.040255 125.766821
 */
