package practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Practice_part2 {
	
	/*
//1번문제. 지금으로써는 아스키코드값 32빼는 방법밖에 모름 ㅡㅡ
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char eng = sc.next().charAt(0);
		
		if(eng >= 97 && eng <= 122) //eng is small letter
			eng -= 32;
		else if(eng >= 65 && eng<= 90) //eng is capital letter
			eng += 32;
		else
			System.out.println("영문자가 아닙니다.");
		System.out.println(eng);
		}
		*/
	
	//2번문제. 
	public static void main(String args[]) {
	/*Scanner sc = new Scanner(System.in);
	String privnumb = sc.next();
	Scanner sc2 = new Scanner(privnumb);
	sc2.useDelimiter("\\s|-");
	//Pattern privnumb = sc.delimiter(); 이렇게 하면 뭐로 구분하는지 "\\s or -"가 출력됨
	while(sc2.hasNext())
		System.out.println(sc2.next());
	
	sc.close();
	
		//sol1 - fail(already gets distinguished from the line 37th. that's why it's got infinite loop of the first string)
		Scanner sc = new Scanner(System.in).useDelimiter("\\s|-");
		String a = sc.next();
		while(sc.hasNext()){
			System.out.println(a);
		}
		sc.close();
		
		//sol2 - fail(Cant use sc.next().useDelimiter("\\s|-");)
		Scanner sc = new Scanner(System.in);
		String a = sc.useDelimiter("\\s|-").next();
		while(sc.hasNext()){
			System.out.println(a);
		}
		sc.close();
		
		
		//그래서 그냥 Scanner 두개 만들어서 먼저 문자열하나받고, 그걸 useDelimiter(conditions)사용하여 구분하기
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		Scanner sc2 = new Scanner(a);
		sc2.useDelimiter("\\s|-");
		
		while(sc2.hasNext()){
			System.out.println(sc2.next());
		}
	
		
		//3번문제
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int m50000, m10000, m1000, m500, m100, m50, m10, m1;
			m50000 = money/50000;
			m10000 = (money-(m50000*50000))/10000;
			money = money-(m50000*50000);
			m1000 = (money-(m10000*10000))/1000;
			money = money-(m10000*10000);
			m500 = (money-(m1000*1000))/500;
			money = money-(m1000*1000);
			m100 = (money-(m500*500))/100;
			money = money-(m500*500);
			m50 = (money-(m100*100))/50;
			money = money-(m100*100);
			m10 = (money-(m50*50))/10;
			money = money-(m50*50);
			m1 = (money-(m10*10))/1;
			System.out.println("오만 원권 "+m50000+"매, 만 원권 "+m10000+"매, 천 원권 "+m1000+"매, "
					+ "500원짜리 동전 "+m500+"개, 50원짜리 동전 "+m50+"개, 10원짜리 동전 "+m10+"개, 1원짜리 동전 "+
					m1+"개");
					
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%3==0 || x%6==0 || x%9==0){
			if((x/3)>0)
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		} else if((x/3)>= 10 && (x%5==1 || x%5==3 || x%5==4)) {
			System.out.println("박수짝");
		}
		
		
		//2번 답
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while(true){
				int a = rd.read();
				if(a==-1)
					break;
				if(a=='\t' || a=='\n')
					continue;
				if(a >= 'a' && a <= 'z'){
					a = a - ('a'-'A');
					System.out.println((char)a);
				} else if(a>= 'A' && a<='Z'){
					a = a + ('a'-'A');
					System.out.println((char)a);
				}
			}
		}
		catch (IOException e){
			System.out.println("입력 오류 발생");
		}
		
		
		//6번, 윤년판정
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0){
			if(year%400==0)
				System.out.println("윤");
			else if(year%100==0)
				System.out.println("평년");
			else
				System.out.println("윤");
		}
		
		
		//8번
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		if(x1!=x2 && y1!=y2){
			
		}
		*/
	}
		
}
