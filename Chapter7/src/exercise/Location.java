package exercise;

import java.util.*;

public class Location {
	private String place;
	private String latitude; //위도
	private String longitude; //경도
	
	public Location(String p, String la, String lo) {
		place=p; latitude=la; longitude=lo;
	}
	
	protected String getPlaceName(){return place;}
	protected String getLatitude(){return latitude;}
	protected String getLongitude(){return longitude;}
	
	protected static void lookUpPlace(HashMap<String, Location> h, String placeName){
		if(h.get(placeName) != null)
				System.out.println(h.get(placeName).getPlaceName()+"\t"+h.get(placeName).getLatitude()+
						"\t"+h.get(placeName).getLongitude()+"\n");
		else
			System.out.println(placeName+" Doesn't Exist.\n");
	}
}
