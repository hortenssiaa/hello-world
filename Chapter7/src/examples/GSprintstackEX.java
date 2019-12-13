package examples;

import java.util.Scanner;

class GenericStack<T>{
	int count;
	Object[] stStore;
	
	public GenericStack() {
		count=0;
		stStore = new Object[10];
	}
	
	protected void push(T t){
		if(count == 10)
			return;
		stStore[count]=t;
		count++;
	}
	
	protected T pop(){
		if(count==0)
			return null;
		count--;
		return (T) stStore[count];
	}
}

public class GSprintstackEX {
	
	public static <T> GenericStack<T> reverse(GenericStack<T> g){
		GenericStack<T> newGS = new GenericStack<T>();
		T val;
		
		while(true){
			val = g.pop();
			if(val==null)
				break;
			else
				newGS.push(val);
		}
		return newGS;
	}

	public static void main(String[] args) {
		
		GenericStack<Double> doubleGS = new GenericStack<Double>();
		
		for(int i=0; i<5; i++)
			doubleGS.push(new Double(i));
		doubleGS = reverse(doubleGS);
		
		GenericStack<String> stringGS = new GenericStack<String>();
		Scanner sc = new Scanner(System.in);
		String str;
		for(int i=0; i<5; i++){
			str = sc.next();
			stringGS.push(str);
		}
		stringGS = reverse(stringGS);
		
		for(int i=0; i<5; i++)
			System.out.println(doubleGS.pop());
		for(int i=0; i<5; i++)
			System.out.println(stringGS.pop());
			
	}

}
