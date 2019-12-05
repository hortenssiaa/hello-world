package examples;

class Rect{
	private int width=0;
	private int height=0;
	public Rect(int w, int h){
		width=w; height=h;
	}
	protected int getWide(){return width*height;}
	protected boolean equals(Rect r){
		if(this.getWide() == r.getWide())
			return true;
		else
			return false;
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 7);
		Rect b = new Rect(7, 2);
		Rect c = new Rect(4, 3);
		
		if(a.equals(b))
			System.out.println("a is equal to b.");
		 else if(a.equals(c))
			 System.out.println("a is equal to c.");
		 else if(b.equals(c))
			 System.out.println("b is equal to c.");
	}

}
