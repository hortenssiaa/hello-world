//char 배열을 메소드의 인자로 전달하여 배열 속의 공백('')문자를, ','로 대치하는 프로그램을 작성하라.
public class ArrayParameter {
	static void replaceSpace(char[] c){
		for(int i=0; i<c.length; i++){
			if(c[i] == ' ')
				c[i] = ',';
		}
	}
	static void getSentence(char[] c){
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]);
		System.out.println();
	}
	
	
	public static void main(String args[]){
		char[] s = {'T','h','i','s',' ','i','s',' ','p','e','n','c','i','l'};
		getSentence(s);
		replaceSpace(s);
		getSentence(s);
	}
}
