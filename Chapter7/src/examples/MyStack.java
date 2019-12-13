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
		return (T)store[count];
	}
}

public class MyStack {

	public static void main(String[] args){
		GStack<String> gsStr = new GStack<String>();
		gsStr.push("LA");
		gsStr.push("busan");
		gsStr.push("seoul");
		
		for(int i=0; i<3; i++)
			System.out.println(gsStr.pop());
		
		GStack<Integer> gsInt = new GStack<Integer>();
		gsInt.push(5);
		gsInt.push(3);
		gsInt.push(1);
		
		for(int i=0; i<3; i++)
			System.out.println(gsInt.pop());
	}
}
