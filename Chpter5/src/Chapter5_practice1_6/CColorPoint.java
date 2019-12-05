package Chapter5_practice1_6;

public class CColorPoint extends CPoint{
	private int a;
	private int b;
	private String color;
	
	public CColorPoint(int a, int b, String s) { //Error: when you extended CPoint which doesnt have default constructor
		super(a,b);
		this.a=a;
		this.b=b;
		color=s;
	}
	
	protected void show(){
		super.setColor(color);
		super.show();
	}
	public String toString(){return super.toString();}
	
	public static void main(String[] args) {
		CPoint a,b;
		
		a = new CPoint(2,3);
		b = new CColorPoint(3,4,"red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);

	}
}
