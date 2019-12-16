package exercise;

public class Line extends GraphicObject{

	public Line(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		System.out.print(this.w+","+this.h+"의 선\n");
	}

}
