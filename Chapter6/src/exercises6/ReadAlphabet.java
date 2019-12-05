package exercises6;

import java.io.*;

public class ReadAlphabet {
	InputStreamReader rd = new InputStreamReader(System.in);
	StringBuffer sb = new StringBuffer();
	private int count=0;
	
	public ReadAlphabet() {
			try {
				while(true){
					int c;
					c = rd.read();
					if(c == 10)
						continue;
					else if(c == -1 || c == 94)
						break;
					sb.append((char)c);
				}
			} catch (IOException e) {
				System.out.println("입력이 잘못되었습니다.");
			}
	}
	
	protected void countCapitalAlphabet(){
		String newString = sb.toString();
		
		for(int i=0; i<newString.length(); i++){
			char c = newString.charAt(i);
			if(Character.isAlphabetic(c)){
				if(65<=c && c<=90)
					count++;
			}
		}
	}
	
	protected String showCapAlp(){
		return "You have "+count+" Capital letter.";
	}

	public static void main(String[] args) {
		ReadAlphabet ra = new ReadAlphabet();
		ra.countCapitalAlphabet();
		System.out.println(ra.showCapAlp());
	}

}
