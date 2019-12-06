package exercises6;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	InputStreamReader rd = new InputStreamReader(System.in);
	private String player;
	private String value;
	long a=0; long b=0; long c=0;
	
	public Person() {
		System.out.print("PLAYER[1] NAME >> "); 
		player=sc.next();
	}
	
	protected void makeRanNum(){
		a = Math.round(Math.random()*3);
		b = Math.round(Math.random()*3);
		c = Math.round(Math.random()*3);
	}
	
	protected String printRanNum(){
		return "YOU GOT >>> ["+a+"]["+b+"]["+c+"] <<< NUMBER";
	}
	
	protected boolean didSheWin(){
		if(a==b && b==c && c==a)
			return true;
		else
			return false;
	}
	
	protected void playGame(){
		System.out.println();
		System.out.print(player+"'S TURN >>> PRESS THE ENTER KEY <<<");
		try {
			int value = rd.read();
			
			if(value == 10){
				this.makeRanNum();
				System.out.println(this.printRanNum());
				System.out.println();
				
				if(this.didSheWin()){
					System.out.println("YOU WON!!!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
