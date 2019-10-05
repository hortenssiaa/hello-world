import java.util.Scanner;

public class chpt2 {
	public static void main(String args[]) {
		
		/* 
		//Scanner 이용하여 연산하
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int x = scanner.nextInt();
		System.out.println(x+"초는 "+(x/60)/60+"시간, "+(x/60)+"분, "+(x%60)+"초입니다.");
		
		
		//shift operation
		System.out.println("write any integer:");
		
		Scanner sc = new Scanner(System.in);
		byte x = sc.nextByte();
		byte b = (byte) (x<<2);
		
		System.out.println("number "+x+" has been changed to "+b+"as the left shift operation.");
		
		
		//조건 연산자 사용하
		int a=5, b=3;
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
		
		
		//if문 예
		int x=3;
		if(x%2==0)
			System.out.println(x+"은(는) 짝수입니다.");
		if(x%2!=0)
			System.out.println(x+"은(는) 홀수입니다.");
			
		
		//80점 이상이면 합격 판별하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		
		if(sc.nextFloat() >= 80)
			System.out.println("축하합니다! 합격입니다.");
		else
			System.out.println("불합격입니다.");
			
		
		//score가 80점 이상, 89점 이하이면 학점을 B라고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요: ");
		float score = sc.nextFloat();
		
		if(score>=80 && score<=89)
			System.out.println("당신의 학점은 B입니다.");
		else
			System.out.println("점수를 예측할 수 없습니다.");
			
		

		//if-else 문을 이용하여 키보드 입력된 성적에 대해 학점을 부여하는 프로그램을 작성해보자
		Scanner sc = new Scanner(System.in);
		char grade;
		while(sc.hasNext()) { //sc에서 뭔가를 입력받았을때는 hasNext()함수에서는 true를 리턴한다. 
			float score = sc.nextFloat(); //while문 안에 적어준다. 
			if(score >=90)
				grade = 'A';
				//System.out.println("학점은 A입니다.");
			else if(score >=80)
				grade = 'B';
				//System.out.println("학점은 B입니다.");
			else if(score >=70)
				grade = 'C';
				//System.out.println("학점은 C입니다.");
			else if(score >=60)
				grade = 'D';
				//System.out.println("학점은 D입니다.");
			else
				grade = 'F';
				//System.out.println("두말할 것도 없이 F");
			System.out.println("학점: "+grade);
			
		}
	
		
		//자신의 학점 입력해서 몆점대인지 확인하기
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String grade= sc.next();
			switch(grade) {
				case "A":
					System.out.println("90~100점입니다.");
					break;
				case "B":
					System.out.println("80~90점 입니다.");
					break;
				case "C":
					System.out.println("70~80점 입니다.");
					break;
				case "D":
					System.out.println("60~70점 입니다.");
					break;
				case "F":
					System.out.println("0~59점 입니다.");
				default:
					System.out.println("잘못된 학점입니다.");
				
					
			}
		}
		
		
		//학점이 A,B/C,D/F인 학생에게 다르게 반응하기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("자신의 학접입력: ");
			char grade = sc.next().charAt(0);
			//Scanner 사용하여 char로 입력받고싶다면, next()함수 뒤에 add .charAt(0) !!
			
			switch(grade) {
			case 'A':
			case 'B':
				System.out.println("참 잘하였습니다.");
				break;
			case 'C':
			case 'D':
				System.out.println("좀 더 노력하세요.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
		
		char grade;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int score = sc.nextInt();
			switch(score/10) {
			case 10:
			case 9:
				grade='A';
				break;
			case 8:
				grade='B';
				break;
			case 7:
				grade='C';
				break;
			case 6:
				grade='D';
				break;
			default:
				grade='F';
			}	
			System.out.println("학점은 "+grade+"입니다.");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("철수 >> ");
		String x = sc.next();
		System.out.print("영희 >> ");
		String y = sc2.next();
		if(x.equals("가위")) {
			switch(y){
			case "바위":
				System.out.println("영희가 이겼습니다.");
				break;
			case "가위":
				System.out.println("비겼습니다.");
				break;
			case "보":
				System.out.println("철수가 이겼습니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		} else if(x.equals("바위")) {
			switch(y){
			case "바위":
				System.out.println("비겼습니다.");
				break;
			case "가위":
				System.out.println("철수가 이겼습니다. ");
				break;
			case "보":
				System.out.println("영희가 이겼습니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		} else if(x.equals("보")) {
			switch(y){
			case "바위":
				System.out.println("철수가 이겼습니다. ");
				break;
			case "가위":
				System.out.println("영희가 이겼습니다.");
				break;
			case "보":
				System.out.println("비겼습니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
}
