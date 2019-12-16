package exercise;

import java.util.*;

class HV{
	public static Vector<String> hashToVector(HashMap<String, String> h){
		Vector<String> v = new Vector<String>();
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			v.add(h.get(it.next()));
		}
		return v;
	}
}

public class HashMapToVectorEx7 {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		
		Vector<String> v = HV.hashToVector(h);
		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));
	}

}
