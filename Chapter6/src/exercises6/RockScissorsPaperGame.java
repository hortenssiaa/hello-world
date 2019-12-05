package exercises6;

import java.util.Scanner;

public class RockScissorsPaperGame {
	private long comNum=0;
	private int playerNum=0;
	
	public RockScissorsPaperGame(int x) {
		comNum = Math.round((Math.random()*2 +1));
		playerNum=x;
	}
	
	protected void playGame(){
		Scanner sc = new Scanner(System.in);
		
		if(comNum == playerNum){
			
			do{
				System.out.println(isItDrew());
				System.out.println();
				
				comNum = Math.round((Math.random()*2 +1));
				
				System.out.println("***** >>> CHOOSE AGAIN! <<<*****");
				System.out.print("ROCK<1>, SCISSORS<2>, PAPER<3> >>");
				playerNum=sc.nextInt();
				
				if(playerNum<1 && 3<playerNum){
					System.out.println("YOU HAVE WRITTEN WRONG NUMGER!");
					System.out.println();
				}
			} while((playerNum<1 && 3<playerNum) || (playerNum==comNum));
		}
					
		switch(playerNum){ //사용자가 입력한 값
			case 1:
				if(comNum == 2){
					System.out.println(doesSheWon());
					System.out.println();
					break;
				} else if(comNum == 3){
					System.out.println(doesSheLost());
					System.out.println();
					break;
				}
			case 2:
				if(comNum == 3){
					System.out.println(doesSheWon());
					System.out.println();
					break;
				} else if(comNum == 1){
					System.out.println(doesSheLost());
					System.out.println();
					break;
				}
			case 3:
				if(comNum == 1){
					System.out.println(doesSheWon());
					System.out.println();
					break;
				} else if(comNum == 2){
					System.out.println(doesSheLost());
					System.out.println();
					break;
				}
		}
	}
	
	protected String getPlayerPosition(){
		if(playerNum == 1)
			return "rock";
		else if(playerNum == 2)
			return "scissors";
		else if(playerNum ==3)
			return "paper";
		else
			return "Error.";
	}
	
	protected String getComputerPosition(){
		if(comNum ==1)
			return "rock";
		else if(comNum==2)
			return "scissors";
		else if(comNum==3)
			return "paper";
		else
			return "Error.";
	}
	
	protected String isItDrew(){return "DREW!"+" >> ( YOU:"+ getPlayerPosition()+" COMPUTER:"+ getComputerPosition()+")";}
	protected String doesSheWon(){return "YOU WON! :)"+" >> ( YOU:"+ getPlayerPosition()+" COMPUTER:"+ getComputerPosition()+")";}
	protected String doesSheLost(){return "YOU LOST :("+" >> ( YOU:"+ getPlayerPosition()+" COMPUTER:"+ getComputerPosition()+")";}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RockScissorsPaperGame[] game = new RockScissorsPaperGame[10];
		int count=0;
		
		System.out.println("***** >>> WELCOME TO THE ROCK-SCISSORS-PAPER GAME <<< *****");
		System.out.println("***** >>> 1. YOU WILL PLAY WITH COMPUTER <<<*****");
		System.out.println("***** >>> 2. CHOOSE ONE OF THESE CHOICES <<< *****");
		System.out.println("***** >>> 3. YOU HAVE 10 CHANCES, CAN PLAY AGAIN IF IT'S DRAW THOUGH <<< *****");
		System.out.println();
		
		do{
			System.out.print("ROCK<1>, SCISSORS<2>, PAPER<3>, END THE GAME<4> >>");
			int playerNumber=sc.nextInt();
			
			if(playerNumber == 4)
				System.exit(0);
			else if(1<=playerNumber && playerNumber<=3){
				game[count] = new RockScissorsPaperGame(playerNumber);
				game[count].playGame();
				count++;
			} else
				System.out.println("YOU HAVE WRITTEN WRONG NUMGER!");
		} while(count<10);
			
	}

}
