package examples;

class GStack<T>{
	int count;
	Object[] store;
	
	public GStack() {
		count =0;
		store = new Object[10];
	}
	
	public void push(T t){
		if(count==10)
			return;
		store[count]=t;
		count++;
	}
	
	public T pop(){
		if(count==0)
			return null;
		count--;//push에서 이미 count가 store배열의 size보다 +1 되어있기 때문
		return (T) store[count];
	}
}

public class MyStack {

	public static void main(String[] args){
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("LA");
		stringStack.push("busan");
		stringStack.push("seoul");
		
		for(int i=0; i<3; i++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(5);
		intStack.push(3);
		intStack.push(1);
		
		for(int i=0; i<3; i++)
			System.out.println(intStack.pop());
	}
}
