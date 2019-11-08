package Chapter5_practice1_6;

import java.util.Scanner;

abstract public class Calc {
	protected abstract void setValue(int a, int b);
	protected abstract int calculate();
	
	public static void main(String[] args){
		Calc c;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=sc.next();
		
		switch(s){
		case "+":
			c = new Add();
			c.setValue(a, b);
			System.out.println(c.calculate());
			break;
		case "-":
			c = new Sub();
			c.setValue(a, b);
			System.out.println(c.calculate());
			break;
		case "*":
			c = new Mul();
			c.setValue(a, b);
			System.out.println(c.calculate());
			break;
		case "/":
			c = new Div();
			c.setValue(a, b);
			System.out.println(c.calculate());
			break;
		}
	}
}
