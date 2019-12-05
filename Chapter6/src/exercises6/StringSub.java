package exercises6;

import java.util.*;

public class StringSub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		s = s.replace("is", "are");
		System.out.println(s);
	}

}
