package practice4_4;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){return a+b;}
}

class Sub{
	private int a;
	private int b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){return a-b;}
}

class Mul{
	private int a;
	private int b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){return a*b;}
}

class Div{
	private int a;
	private int b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){return a/b;}
}

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Add a;
		Sub s;
		Mul m;
		Div d;
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String s1=sc.next();
		
		if(s1.equals("+")){
			a = new Add();
			a.setValue(n1, n2);
			System.out.println(a.calculate());
		} else if(s1.equals("-")){
			s = new Sub();
			s.setValue(n1, n2);;
			System.out.println(s.calculate());
		} else if(s1.equals("*")){
			m = new Mul();
			m.setValue(n1, n2);
			System.out.println(m.calculate());
		} else if(s1.equals("/")){
			d = new Div();
			d.setValue(n1, n2);
			System.out.println(d.calculate());
		} 
	}

}
