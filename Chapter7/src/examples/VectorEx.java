package examples;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(new Integer(4));
		v.add(-1);
		
		//벡터 중간에 삽입하기
		v.add(2, 100); //5 4 100 -1
		
		System.out.println("벡터 내의 요소 객체 수: "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		
		//모든 요소 정수 출력하기 1
		for(int i=0; i<v.size(); i++)
			System.out.print("v<"+i+">: "+v.get(i)+"  ");
		System.out.println();
		
		//2
		for(int i=0; i<v.size(); i++){
			int n = v.get(i);
			System.out.print("v<"+i+">: "+n+"  ");
		}
		System.out.println();
		
		//3
		for(int i=0; i<v.size(); i++){
			Integer obj = v.get(i);
			int n = obj.intValue();
			System.out.print("v<"+i+">: "+n+"  ");
		} System.out.println();
		
		//벡터 속의 모든 정수 더하기
		int sum=0;
		for(int i=0; i<v.size(); i++){
			int n = v.get(i);
			sum += n;
		} System.out.println("sum: "+sum);
	}

}
