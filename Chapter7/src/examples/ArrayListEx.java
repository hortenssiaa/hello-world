package examples;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++){
			System.out.print("이름을 입력하세요>>");
			String str=sc.next();
			a.add(str);
		}
		
		String longestWord = a.get(0);
		for(int i=0; i<a.size(); i++)
			System.out.print(a.get(i)+" ");
		System.out.println();
	
		for(int i=1; i<a.size(); i++){
			if(longestWord.length() < a.get(i).length())
				longestWord = a.get(i);
		}
		System.out.println("Longest name is >> " + longestWord);
	}

}
