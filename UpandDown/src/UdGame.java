import java.util.Random;
import java.util.Scanner;

public class UdGame {
	public static void main(String[] args){
		/*
		Scanner sc = new Scanner(System.in);
		int x=0, y=99, comp, k;
		int count=1;
		
		//처음에 숨길 카드를 선택하기 위해, Random 클래스 이용
		Random r = new Random();
		int num = r.nextInt(100); //0-99까지 임의의 정수 생성
		
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				System.out.println(x+"-"+y);	
				System.out.print(count+">>");
				k= sc.nextInt();
				
				if(k > num) {
					y=k;
					System.out.println("더 낮게");
				} else if(k < num) {
					x=k;
					System.out.println("더 높게");
					
				} else if(k == num) {
					System.out.println("맞았습니다.");
					System.out.print("다시하시겠습니까(y/n)>>");
					if(sc.next().equals("y"))
						continue;
				} 
				//System.out.println(x+"-"+y);
				count++;
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		int k;
		
		Random r = new Random();
		int num = r.nextInt(100);
		
		while(true) {
			int min=0;
			int max=99;
			int count=1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			for(int i=0;;i++){
				System.out.println(min+"-"+max);
				System.out.println(count+">>");
				k = sc.nextInt();
				
				if(k > num) {
					max=k;
					System.out.println("더 낮게");
				} else if(k<num){
					min=k;
					System.out.println("더 높게");
				} else if(k==num){
					System.out.println("맞았습니다.");
					System.out.print("다시하시겠습니까(y/n)>>");
					if(sc.next().equals("y")){
						break;
					} else if(sc.next().equals("n")){
						System.out.println("끝났습니다.");
						System.exit(0);
					}
				} count++;
					
			}
		}
	}
}
