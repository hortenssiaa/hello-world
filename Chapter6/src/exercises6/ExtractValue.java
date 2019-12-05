package exercises6;

import java.util.*;

public class ExtractValue {
	private String str;
	StringTokenizer st;
	int count=0;
	
	public ExtractValue(String s) {
		str = s;
		st = new StringTokenizer(str,"&=");
	}
	
	protected void tokenizeString(){
		String strArr[] = new String[st.countTokens()];
		
		while(st.hasMoreTokens()){
			strArr[count] = st.nextToken();
			count++;
		}
		for(int i=0; i<strArr.length-3; i++)
			System.out.println(strArr[2*i]+" "+strArr[(2*i)+1]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		ExtractValue ev = new ExtractValue(str1);
		ev.tokenizeString();
	}

}
