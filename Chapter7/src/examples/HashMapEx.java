package examples;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("love", "사랑");
		h.put("apple", "사과");
		h.put("baby", "아기");
		
		Set<String> keys = h.keySet(); //key 문자열을 가진 집합 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); 
		//여기서 key set를 얻었으니 하나씩 읽으려고 하는데 Iterator인터페이스를 사용해야하는 이유는?
		//Set 컬렉션 클래스도, HashMap클래스같이 요소의 저장순서를 유지하지 않는다. 따라서 인덱스에 따라 읽을 수 없기 때문에 
		// 순차적으로 읽을 수 있는 Iterator 클래스를 사용한다. 
		
		while(it.hasNext()){
			String key = it.next();
			String value = h.get(key);
			System.out.println("("+key+","+value+")");
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<h.size(); i++){
			System.out.print("찾고 싶은 단어는?");
			String eng = sc.next();
			System.out.println(h.get(eng));
		}
		
		System.out.println();
		System.out.println("Initial Mappings are: "+ h);
		System.out.println("The set is: "+h.keySet());
		
		Set<String> s = h.keySet();
		System.out.println(s); 
		//이미 Set클리스로 s배열이 만들어 졌기때문에, sysout에서 출력하면 iterator를 사용하지 않았음에도, 전체 들어있는 값들이 나온다. 
		//그러나 순차적으로 하나씩 키를 읽어들이고, 그에 대한 값을 얻고 싶을 때는 iterator 를 사용해야 한다. 
		
		
	}

}
