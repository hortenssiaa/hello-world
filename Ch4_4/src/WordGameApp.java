import java.util.Scanner;

class Player{
	public static String word="아버지";
	String answer;
	private String playerName;
	Scanner sc = new Scanner(System.in);
	
	public Player(){
		System.out.print("참가자의 이름을 입력하세요>>");
		playerName = sc.next();
	}
	
	public void sayword(){ //게임 참가자의 이름 필드 & 단어 입력받는
		System.out.print(this.playerName+">>");
		answer = sc.next();
	}
	
	public void setWord(){ word = this.answer;}
	
	public boolean succeed(){ //끝말잇기에 성공하였는지를 판별 & 게임 계속하는지를 판별
		int lastIndex = word.length()-1; //word의 마지막 문자에 대한 인덱스
		char lastChar = word.charAt(lastIndex); //word의 마지막 문자
		char firstChar = answer.charAt(0);
		
		if(lastChar == firstChar){
			return true;
		} else{
			System.out.println("word는 "+lastChar+"answer은 "+firstChar); //현재의 값이 넘어왔나 확인차
			System.out.println(playerName+"이 졌습니다.");
			return false;
		}
	}
}

public class WordGameApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int pNum = sc.nextInt();
		Player[] pArray = new Player[pNum];
		
		for(int i=0; i<pNum; i++)
			pArray[i] = new Player(); //참가자의 이름을 pNum번 입력받는다
		
		System.out.println("시작하는 단어는 "+Player.word+"입니다.");
		
		LABEL: //쓰는게 맞는걸까,,?
		for(int i=0; i<pNum; i++){
			for(int j=0; j<pNum; j++){
				pArray[j].sayword();
				if(pArray[j].succeed()){
					pArray[j].setWord();
				}else{
					break LABEL;
				}
				
			}
		}
	}
}
