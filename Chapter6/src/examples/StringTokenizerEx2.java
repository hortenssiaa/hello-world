package examples;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("냉장고, 세탁기, 에어컨, TV, 오디오", ", ");
		//int n=st.countTokens();
		//for(int i=0; i<n; i++) // 1)
		//	System.out.println(st.nextToken());
		
		while(st.hasMoreTokens()) // 2)
			System.out.println(st.nextToken());
	}

}
