package exercise;

import java.util.*;

public class ScoreCalculatorEx2 {
	
	protected static <T> void gradePrinter(ArrayList<T> a, int i){
		double score=0.0;
		for(int n=0; n<i; n++){
			String charScore = (String) a.get(n);
			if("A".equals(charScore) || "B".equals(charScore) || "C".equals(charScore) || "D".equals(charScore) || "F".equals(charScore)){
				switch(charScore){
					case "A":
						score=4.0;
						System.out.println("The Grade Of Student"+(n+1)+" is "+score+"."); 
						break;
					case "B":
						score=3.0;
						System.out.println("The Grade Of Student"+(n+1)+" is "+score+"."); 
						break;
					case "C":
						score=2.0;
						System.out.println("The Grade Of Student"+(n+1)+" is "+score+"."); 
						break;
					case "D":
						score=1.0;
						System.out.println("The Grade Of Student"+(n+1)+" is "+score+"."); 
						break;
					case "F":
						score=0.0;
						System.out.println("The Grade Of Student"+(n+1)+" is "+score+"."); 
						break;
				}
			} else{
				System.out.println(charScore+" is wrong grade.");
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> score = new ArrayList<String>();
		
		System.out.print("How many student's score will you calculate? >> ");
		int studentNum = sc.nextInt();
		
		for(int i=0; i<studentNum; i++){
			String s = sc.next();
			score.add(s);
		}
		gradePrinter(score, studentNum);
	}
}
