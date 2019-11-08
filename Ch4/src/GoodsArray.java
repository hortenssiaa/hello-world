import java.util.Scanner;

/*
class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	Goods(String next) {
		name = next;
	}
	void getInfo(){
		System.out.println(name+" "+price+" "+numberOfStock+" "+sold);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Goods[] gs = new Goods[3];
		
		for(int j=0; j<gs.length; j++){
				gs[j] = new Goods(sc.next());
				gs[j].price = sc.nextInt();
				gs[j].numberOfStock = sc.nextInt();
				gs[j].sold = sc.nextInt();
		}
		for(int i=0; i<gs.length; i++){
			gs[i].getInfo();
		}
	}
}*/

public class GoodsArray {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Goods[] A1 = new Goods[3];
		
		for(int i=0; i<A1.length; i++){
			//A1[i] = new Goods(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			String name=sc.next();
			int price=sc.nextInt();
			int numberOfStuck=sc.nextInt();
			int sold=sc.nextInt();
			A1[i] = new Goods(name, price, numberOfStuck, sold);
		}
		for(int i=0; i<A1.length; i++){
			System.out.println(A1[i].getName()+" "+A1[i].getPrice()+" "+
					A1[i].getNumberOfStuck()+" "+A1[i].getSold());
		}
	}
}

class Goods{
	private String name;
	private int price;
	private int numberOfStuck;
	private int sold;
	
	Goods(String s, int p, int num, int sol){ //일반생성자
		name=s;
		price=p;
		numberOfStuck=num;
		sold=sol;
	}
	
	String getName(){return name;}
	int getPrice(){return price;}
	int getNumberOfStuck(){return numberOfStuck;}
	int getSold(){return sold;}
}





