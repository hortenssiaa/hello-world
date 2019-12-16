package exercise;

import java.util.*;

public class ArrlistIteratorEx4 {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<>();
		for(int i=0; i<20; i++){
			double d = Math.random()*100;
			a.add(d);
		}
		Iterator<Double> it = a.iterator();
		int count=1;
		while(it.hasNext()){
			System.out.println("["+count+"]: "+it.next());
			count++;
		}
	}

}
