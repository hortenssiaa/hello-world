package examples;

import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l){
		Iterator<String> it = l.iterator();
		while(it.hasNext()){
			String value = it.next();
			String imoji;
			if(it.hasNext())
				imoji = "->";
			else
				imoji = "\n";
			System.out.print(value+imoji);
		}
		
	}
	
	public static void main(String[] args){
		LinkedList<String> lk = new LinkedList<String>();
		
		lk.add("트랜스포머");
		lk.add("스타워즈");
		lk.add("매트릭스");
		lk.add(0, "터미네이터");
		lk.add(2, "아바타");
		
		Collections.sort(lk);
		printList(lk);
		
		Collections.reverse(lk);
		printList(lk);
		
		//이렇게 해도 되는데
		int index = 1+ lk.indexOf("아바타");
		
		//여기서 Colletcions클래스 를 배우는 입장에서... binarySearch() 메서드 사용
		//binarySearch(List, Element) 메서드는 현재 검색할 List (지금은 lk)에서 Element (지금은 "아바타")가 있는지, 
		// 있으면 저장되어있는 인덱스 값 리턴, 없으면 java.lang.IndexOutOfBoundsException 예외 발생
		int indexx = Collections.binarySearch(lk, "아바타") +1;
		
		System.out.println(lk.get((index-1))+"는 "+index+"번째 요소입니다.");
		System.out.println(lk.get((-1+indexx))+"는 "+indexx+"번째 요소입니다.");
	}
}
