package exercise;

import java.util.Vector;

public class MyClassEx8<E> {
	private E s;
	
	public MyClassEx8(E s) {
		this.s=s;
	}
	
	void setS(E s){
		this.s=s;
	}
	
	E getS(){
		return (E)s;
	}

	public static void main(String[] args) {
		Vector<MyClassEx8> v = new Vector<MyClassEx8>();
		
		v.add(new MyClassEx8<String>("It's "));
		v.add(new MyClassEx8<String>("2019 "));
		v.add(new MyClassEx8<String>("now. "));
		
		v.get(2).setS(". Soon, 2020 :)");
		
		for(int i=0; i<v.size(); i++)
			System.out.print(v.get(i).getS());
	}

}
