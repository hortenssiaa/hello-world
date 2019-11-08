import java.util.Random;
import java.util.Scanner;

public class Ch3_Practice {

	static int sum=0; //3-10
	static int[] count = new int[99]; //3-12
	static int num=1; //3-12
	static String clap; //3-12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//p164 3-1
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오>>");
		int x = sc.nextInt();
		
		for(int i=x; i>0; i--){
			for(int j=i; j>0; j--)
				System.out.print("*");
			System.out.println();
		}
		
		
		//3-2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하시오>>");
		char alp = sc.next().charAt(0);
		
		for(int i=(alp-'a'); i>=0; i--){
			alp -= (alp-'a');
			for(int j=i; j>=0; j--) {
				System.out.print(alp);
				alp++;
			} 
			System.out.println();
		}

		
		//3-3
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력:");
		
		int count=0;
		int num=sc.nextInt();
		String num2 = Integer.toBinaryString(num);
		
		try {
		for(int i=0; i<num2.length(); i++){
			char countBox[][] = new char[4][num2.length()];
			countBox[3][i] = num2.charAt(i);
			if(countBox[3][i] == '1')
				count++;
			
		} System.out.println(count+"번");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 지정되지 않은(공간을 넘는) 곳 까지 입력하려고 시도함");
		}
		
		
		//3-4최대 공약수 구하기 	
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력(0제외):");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int div=0;
		int result=0;
		
		if(num1 != 0 && num2 != 0){
			if(num1 > num2) {
				div = num1;
				if(div%num2 ==0)
					result =num2;
				else
					result = div%num2;
			} else if(num1 < num2) {
				div = num2;
				if(div%num1 ==0)
					result=num1;
				else
					result = div%num1;
			}
		}
		System.out.println(num1+"와 "+num2+"의 최대 공약수는 "+result+"입니다.");
		
		
		//3-5
		Scanner scanner = new Scanner(System.in);
		int[][] intArray = new int[2][10];
		
		System.out.print("10개의 정수 입력:");
		for(int i=0; i<10; i++)
			intArray[0][i] = scanner.nextInt();
		for(int i=0; i<10; i++){
		if(intArray[0][i]%3 == 0) {
			intArray[1][i] = intArray[0][i];
			System.out.print(intArray[1][i]+" ");
		}		}
		
		
		//3-6
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[10];
		int min, max, tmp;
		System.out.print("정수 10개 입력:");
		for(int i=0; i<10; i++)
			intArray[i] = sc.nextInt();
		
		for(int i=0; i<10; i++){
			min = intArray[i];
			for(int j=i+1; j<10;j++){
				if(intArray[j] < min) {
					tmp = min;
					min = intArray[j];
					intArray[j] = tmp;
					intArray[i] = min;
				}
			}
		} 
		
		for(int i=0; i<10; i++)
			System.out.print(intArray[i]+"\t");

		
		//3-7
		int intA2[][] = new int[4][4];
		for(int x=0; x<4; x++){
			for(int y=0; y<4; y++){
				int i = (int)Math.round(Math.random()*9+1);
				intA2[x][y] = i;
				System.out.print(intA2[x][y]+"\t");
			}System.out.println();
		}
		
		
		//3-8
		//Random random = new Random();
		int intA[][] = new int[4][4];
		int x, y, result=0;
		
		while(result<8){
			x =(int)(Math.random()*4); //범위 0~4
			y =(int)(Math.random()*4);
			if(intA[x][y]==0){ //intA[x][y]에 아무것도 안들어있다면 
				intA[x][y] = (int)(Math.random()*10+1); //범위 1~10
				result++;
			}
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(intA[i][j]+"\t");
			}System.out.println();
		}
		
		
		//3-9
		int sum=0;
		for(int i=0; i<args.length; i++)
			sum += Integer.parseInt(args[i]);
		
		System.out.println(sum/args.length);
		
		
		//3-10  명령형 인자 중에서 정수만을 골라 합
		int sum=0, count=0, ct1=0;
		
	//	while(count<args.length){
			try{
				for(int i=0; i<args.length; i++){
					count++;
					sum += Integer.parseInt(args[i]);
					//정수인지 아닌지 알려면 어떤 코드가 필요하지..?? -> try-catch문으로 NumberFormatException 사용\
				}
			}catch (NumberFormatException e){
				continue; ???????
			}
				System.out.println(sum);
			//}	
			 * 
			 * 
	
			 
		
		
		//3-10 다시.. main 함수 위에 static int sum=0 여기꺼
		
		for(int i=0; i<args.length; i++){
			isNumber(args[i]);
		} System.out.println("정수만 더한 값은 "+sum+"입니다.");
		
		
	}
	
	public static boolean isStringInt(String s){
		try{
			int x = Integer.parseInt(s);
			sum += x;
			return true;
		} catch(NumberFormatException e){
			return false;
		}
	}
	
	public static void isNumber(String s){
		
		if(isStringInt(s)){
			System.out.print("");
		} else{
			System.out.print("");
		}
	
		
		
		//3-11
		Scanner sc = new Scanner(System.in);
		int[] unit={50000,10000,1000,500,100,50,10,1};
		int[] store = new int[unit.length];
		
		System.out.print("금액을 입력하세요:");
		int x=sc.nextInt();
		for(int i=0; i<unit.length; i++){
			 store[i] = x/unit[i];
			 x=x-(unit[i]*store[i]);
			 if(i<3)
				 System.out.println(unit[i]+"원 권 "+store[i]+"개");
			 else if(i>=3)
				 System.out.println(unit[i]+"원짜리 동전 "+store[i]+"개");
		} 
		
		
		
		//3-12
		String clap;
		int[] count = new int[99];
		int num=1;
		for(int i=0; i<count.length; i++){
			count[i] = num;
			
			for(int j=1; j<10; j++){
				
				if(count[i]<10){
					if(count[i]%3 == 0){
						clap="한";
						System.out.println(count[i]+" 박수 "+clap+"번");
					}
					num++;
					continue;
					
				} else if(10*j < count[i] && count[i]<10*(j+1)){
					if( (count[i]-(10*j))%3 == 0){
						if(count[i]/3>10){
							clap="두";
							System.out.println(count[i]+" 박수 "+clap+"번");
						}
					} else if(0<= count[i]%30 && count[i]%30 <=9){
						clap="한";
						System.out.println(count[i]+" 박수 "+clap+"번");
					}
					num++;
				} 
			} 
			num++;
		}
		
		*/
		//3-12 static num, count, clap 여기꺼임!!! 
		for(int i=0; i<count.length; i++){
			count[i]=num;
			clap(count[i]);
			num++;
		}
	} 
	
	public static void clap(int x){
		for(int j=1; j<10; j++){
			if(x<10){ //x=1~9
				if(x%3 == 0){ //x=3,6,9
					clap="한";
					System.out.println(x+" 박수 "+clap+"번");
					break;
				}	
			} else if(10*j <= x && x <10*(j+1)){ //x= (10~19), (20~29), (30~39), (40~49) ...
				if(0<=(x%30) && (x%30)<=9) {//x= (30~39), (60~69), (90~99)
					if((x%30)==0) { //x= 30, 60 ,90
						clap="한";
						System.out.println(x+" 박수 "+clap+"번");
					} else if(x%3 != 0) { //x=31,32,34,35,37,38,  61,62,64,65,67,68, ...
						if(1<= (x/30) && (x/30) <=3){
							clap="한";
							System.out.println(x+" 박수 "+clap+"번");
							break;
						}
					} else if((x%3)==0){ //x= (33,36,39), (63,66,69), (93,96,99)
						if(x/3 >10) {
							clap="두";
							System.out.println(x+" 박수 "+clap+"번");
						}
					}
					break;
						
				} else if((x-(10*j))%3 == 0){ //10,13,16,19, / 20,23,26,29 / 30,
					if(x-(10*j) == 0)
						break;
					else if((x%30)==0)
						break;
					
					clap="한";
					System.out.println(x+" 박수 "+clap+"번");
					break;
				}
				break;
			}
		} //오타났던거: 3,6,9가 10번씩 출력됨, 10번대(10~90) 2번씩 출력됨, '두번'이 안나옴 
		
	}
}
