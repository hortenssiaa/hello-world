package ch5_examples;

interface MobilePhone{
	boolean sendCall();
	boolean receiveCall();
	boolean sendSMS();
	boolean receiveSMS();
}
interface MP3{
	void play();
	void stop();
}
class PDA{
	public int calculate(int x, int y){
		return x+y;
	}
}

public class SmartPhone extends PDA implements MobilePhone, MP3{
	public boolean sendCall(){
		System.out.println("전화 걸기");
		return true;
	}
	public boolean receiveCall(){
		System.out.println("전화 받기");
		return true;
	}
	public boolean sendSMS(){
		System.out.println("문자 보내기");
		return true;
	}
	public boolean receiveSMS(){
		System.out.println("문쟈 뱓기");
		return true;
	}
	public void play(){
		System.out.println("음악 재생");
	}
	public void stop(){
		System.out.println("재생 중지");
	}
	public void scheduler(){
		System.out.println("일정 관리");
	}
	public void applicationManager(){
		System.out.println("응용프로그램 설치/삭제");
	}

	
	public static void main(String[] args) {
		SmartPhone sphone = new SmartPhone();
		sphone.sendCall();
		sphone.play();
		System.out.println(sphone.calculate(1, 7));
		sphone.scheduler();
	}

}
