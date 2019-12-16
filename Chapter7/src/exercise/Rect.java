package exercise;

public class Rect extends GraphicObject{

	public Rect(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		System.out.print(this.w+","+this.h+"의 사각형\n");
	}

}
