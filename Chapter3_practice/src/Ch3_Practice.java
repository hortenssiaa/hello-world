import java.util.Random;
import java.util.Scanner;

public class Ch3_Practice {

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
		System.out.println("0보다 큰 정수 입력:");
		
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
		*/
		
		//3-8
		Random random = new Random();
		int intA[][] = new int[4][4];
		int limit = random.nextInt(4); //range : 0~3
		for(int i=0; i<=limit; i++){
			intA
		}
	}

}
