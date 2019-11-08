package Chapter5_practice1_6;

public class Mul extends Calc{
	private int a;
	private int b;
	protected void setValue(int a, int b){
		this.a=a;
		this.b=b;
	}
	protected int calculate(){return a*b;}
}
