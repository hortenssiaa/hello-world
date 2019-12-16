package exercise;

import java.util.*;

public class MaxVectoreEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Double> v = new Vector<>(10);
		
		for(int i=0; i<v.capacity(); i++){
			double n=sc.nextDouble();
			v.add(n);
		}
		
		double max=v.get(0);
		for(int i=1; i<v.capacity(); i++){
			if(max < v.get(i))
				max=v.get(i);
		}
		System.out.println("Maximun >> "+max);
	}

}
