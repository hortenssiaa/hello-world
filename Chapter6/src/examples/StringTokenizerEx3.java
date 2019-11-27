package examples;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {

	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("1+4+5+8+34+63+265", "+");
		int count[] = new int[st1.countTokens()];
		int sum=0;
		
		for(int i=0; i<count.length; i++){
			count[i] = Integer.parseInt(st1.nextToken());
			sum += count[i];
			System.out.println(count[i]);
		}
		System.out.println(sum);
	}

}
