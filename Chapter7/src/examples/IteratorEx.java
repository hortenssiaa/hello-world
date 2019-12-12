package examples;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(new Integer(5));
		v.add(4);
		v.add(-1);
		v.add(2, 100); //5 4 100 -1
		
		//Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()){
			int n = it.next(); //다음 요소 리턴
			System.out.println(n);
		}
		
		//Iterator를 이용하여 모든 정수 더하기
		int sum=0;
		it = v.iterator(); //다시 객체 얻기
		while(it.hasNext()){
			sum += it.next();
		} System.out.println("Sum >> " +sum);
	}

}
