package Chapter5_practice1_6;

public class LaserPrinter extends Printer{
	private int toner=500;
	private int numofPrints=0;
	
	public LaserPrinter(int i, String a, String b, String c) {
		super(i, a, b, c); 
		numofPrints = i; //인쇄매수
	}
	protected int getTonerRemains(){return toner -= (5*numofPrints);}
	protected void print(){ 
		super.print();
		System.out.println("Remains of Ink>> "+getTonerRemains());
	}
}
