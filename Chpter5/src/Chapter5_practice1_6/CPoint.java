package Chapter5_practice1_6;

public class CPoint{
	private int a;
	private int b;
	private String s="";
	
	public CPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	protected void setColor(String s){this.s=s;}
	protected String getColor(){return s;}
	
	protected void show(){ System.out.println("("+a+","+b+")"+getColor());}
	public String toString(){ return "("+a+","+b+")입니다.";}
}
