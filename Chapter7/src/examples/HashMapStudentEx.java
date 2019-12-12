package examples;

import java.util.*;

class Student{
	int id=0;
	String telephone;
	
	public Student(int id, String tel) {
		this.id=id; telephone=tel;
	}
	
	protected String getStudentIdentification(){
		return this.id+" "+this.telephone;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> hmap = new HashMap<String, Student>();
		
		hmap.put("한원선", new Student(2, "010-222-2222"));
		hmap.put("황기태", new Student(1, "010-111-1111"));
		hmap.put("이영희", new Student(3, "010-333-3333"));
		
		System.out.println("HahsMap의 요소 개수 :"+hmap.size());
		
		Set<String> keys = hmap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			//1 이렇게 하거나
			System.out.println(key+" : "+hmap.get(key).getStudentIdentification());
			
			//2 이렇게 하거나
			Student student = hmap.get(key);
			System.out.println(key+" : "+student.id+" "+student.telephone);
		}
	}

}
