package Chapter5_practice1_6;

import java.util.Scanner;

abstract public class DObject {
	protected abstract void draw();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DObject[] ob = new DObject[10];
		int menu=0, count=0, type=0, x=0;
		
		do{
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			menu=sc.nextInt();
			
			switch(menu){
			case 1:
				System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
				type=sc.nextInt();
				
				switch(type){
				case 1:
					ob[count] = new Line();
					break;
				case 2:
					ob[count] = new Rect();
					break;
				case 3:
					ob[count] = new Circle();
				}
				count++;
				break;
				
			case 2:
				System.out.print("삭제할 도형의 위치(0~"+(count-1)+")>>");
				x=sc.nextInt();
				if(x>=count){
					System.out.println("삭제할 수 없습니다.");
					break;
				} else {
					count--;
					ob[count]=null;
					break;
				}
				
			case 3:
				for(int i=0; i<count; i++)
					ob[i].draw();
				break;
				
			case 4:
				System.exit(0);
				break;
			}
		} while(count<10);
	}

}
