package examples;

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("한원선", 99);
		hmap.put("한홍진", 97);
		hmap.put("황기태", 34);
		hmap.put("이영희", 98);
		hmap.put("정원석", 70);
		
		System.out.println("HashMap의 요소 개수 :"+hmap.size());
		
		Set<String> keys = hmap.keySet();
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println(key+" : "+hmap.get(key));
		}
	}

}
