package Chapter5_practice1_6;

public class MyColorPoint extends MyPoint{
	int x;
	int y;
	int tmp;
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.x=x; this.y=y; this.color=color;
	}
	
	protected void move(int x, int y){ this.x=x; this.y=y; }
	protected void reverse(){ tmp=x; x=y; y=tmp; }
	protected void show() { System.out.println(x+","+y+","+color); }

	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3, "blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
