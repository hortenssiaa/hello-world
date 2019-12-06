package exercises6;

import java.util.Scanner;

public class GamblingApp extends Person{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p[] = new Person[2];
		
		System.out.println("***** >>> WELCOME TO THE GAMBLING GAME <<< *****");
		System.out.println("***** >>> 1. TWO PLAYERS ARE NEEDED TO START IT! <<<*****");
		System.out.println("***** >>> 2. IF SOMEONE GETS ALL SAME NUMBER, THE PLAYER WIN! <<< *****");
		System.out.println();
		System.out.print("*****  PLAY THE GAME<1>, END THE GAME<2> >> ");
		int x=sc.nextInt();
		
		switch(x){
			case 1:
				for(int i=0; i<p.length; i++)
					p[i]=new Person();
				
				while(true){
					for(int i=0; i<p.length; i++)
						p[i].playGame();
				}
				
			case 2:
				System.exit(0);
				break;
		}
		
	}

}
