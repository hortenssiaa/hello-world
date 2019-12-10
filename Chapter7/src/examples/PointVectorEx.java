package examples;

import java.util.Vector;

class Point{
	private int x, y;
	
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> pointV = new Vector<>();
		pointV.add(new Point(2,3));
		pointV.add(new Point(-5, 20));
		pointV.add(new Point(30, -8));
		
		for(int i=0; i<pointV.size(); i++){
			System.out.println(pointV);
		} System.out.println();
		
		System.out.println(pointV); //== sysout(pointV.toString)
		System.out.println();
		
		for(int i=0; i<pointV.size(); i++){
			Point p = pointV.get(i);
			System.out.println(p);
		}
	}

}
