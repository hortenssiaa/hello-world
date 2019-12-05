package exercises6;

import java.io.*;
import java.util.StringTokenizer;

public class LongestWord {
	InputStreamReader rd = new InputStreamReader(System.in);
	StringBuffer sb = new StringBuffer();
	String longest;
	
	public LongestWord() {
		try{
			while(true){
				int c = rd.read();
				if(c == 10)
					continue;
				else if(c == -1 || c == 94)
					break;
				sb.append((char)c);
			}
		} catch(IOException e){
			System.out.println("입력이 잘못되었습니다.");
		}
	}
	
	protected void tokenizeLongestWord(){
		String str = sb.toString();
		StringTokenizer st = new StringTokenizer(str, " /,.&?");
		longest = st.nextToken();
		
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			if(token.length() > longest.length())
				longest = token;
		}
	}
	
	protected String printLongestWord(){
		return "Longest word is >> "+longest;
	}
	
	

	public static void main(String[] args) {
		LongestWord lw = new LongestWord();
		lw.tokenizeLongestWord();
		System.out.println(lw.printLongestWord());
	}

}
