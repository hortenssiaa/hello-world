package exercise;

import java.util.*;

interface Stack<T>{
	T pop();
	boolean push(T ob);
}

public class MyStackEx11<T> {
	LinkedList<T> ll = new LinkedList<T>();
	
	protected T pop(){
		if(!ll.isEmpty()){ //if it's not empty
			T t = ll.getLast();
			ll.remove(ll.getLast());
			return t;
		} else {//if it's empty
			return null;
		}
	}
	
	protected boolean push(T ob){
		if(ob != null){
			ll.add(ob);
			return true;
		} else
			return false;
		
	}

	public static void main(String[] args) {
		LinkedList<Integer> linkedL = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You Can Push On The Stack AS MANY AS YOU WANT!");
		while(true){
			System.out.print("PUSH<1>, POP<2> >> ");
			int menu=0;
			menu=sc.nextInt();
			
			switch(menu){
				case 1:
					System.out.print("Integer >> ");
					int number=sc.nextInt();
					linkedL.push(number);
					System.out.println();
					break;
				case 2:
					if(!linkedL.isEmpty()){
						System.out.println("POPED OBJECT : "+linkedL.pop()+"\n");
						break;
					}else{
						System.out.println("The Stack Is Empty!!\n");
						break;
					}
			}
			
		}
	}

}
