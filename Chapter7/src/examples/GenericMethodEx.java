package examples;

public class GenericMethodEx{
	
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> gs = new GStack<T>();
		
		/*
		 * 방법 1
		 
		for(int i=0; i<5; i++)
			gs.push(a.pop());
		
		return gs;
		*/
		
		//방법2
		while(true){
			T val;
			val = a.pop(); //pop이 다 됐을때 멈추냐 or null을 리턴하느냐 -> 스택이 비었을때 null을 리턴하네 ㅇㅅㅇ
			if(val == null)
				break;
			else
				gs.push(val);
		}
		return gs;
		
	}

	public static void main(String[] args){
		GStack <Double> doubleStack = new GStack<Double>();
		
		for(int i=0; i<5; i++)
			doubleStack.push(new Double(i));
		
		doubleStack = reverse(doubleStack);
		for(int i=0; i<5; i++)
			System.out.println(doubleStack.pop());
	}
}
