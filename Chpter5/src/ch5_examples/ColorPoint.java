package ch5_examples;

class Point{
	int x, y;
	void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	void showPoint(){
		System.out.println("("+x+","+y+")");
	}
}

public class ColorPoint extends Point{
	String color;
	void setColorPoint(String color){
		this.color = color;
	}
	void showColorPont(){
		System.out.print(color);
		showPoint();
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.setColorPoint("red");
		cp.setPoint(3, 4);
		cp.showColorPont();
	}

}
