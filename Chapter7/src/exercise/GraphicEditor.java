package exercise;

import java.util.*;

abstract class GraphicObject{
	int x,y,w,h;
	public GraphicObject(int x, int y, int w, int h) {
		this.x=x; this.y=y; this.w=w; this.h=h;
	}
	
	public abstract void view();
}

public class GraphicEditor {
	
	Vector<GraphicObject> v = new Vector<GraphicObject>();
	
	void add(GraphicObject ob){
		v.add(ob);
	}
	
	void draw(){
		for(int i=0; i<v.size(); i++){
			GraphicObject go = v.get(i);
			System.out.print(go.x+","+go.y+" -> ");
			go.view();
		}
	}

	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.add(new Rect(2, 2, 3, 4));
		g.add(new Line(3, 3, 8, 8));
		g.add(new Line(2, 5, 6, 6));
		g.draw();
	}

}
