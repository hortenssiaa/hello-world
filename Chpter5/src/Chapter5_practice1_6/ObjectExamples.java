package Chapter5_practice1_6;

public class ObjectExamples {
	int a;
	static int b;
	static int array[];
	static int point;
	
	public ObjectExamples() {
		b=5;
		array = new int[b];
		point=-1;
		
		System.out.println("오브젝트 생성자 호출되었엄");
	}
	static String show(Object x){
		if(empty()){
			point++;
		
		//for(int i=0; i<b; i++)
			//array[i] = (int) Math.round(Math.random()*9+1);
		
	//	for(int i=0; i<b; i++)
		//	System.out.println(array[i]);
		
		return "asdf"+" ";
		} else
			return "wef"+" ";
	}
	static boolean empty(){
		if(point == -1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		System.out.println(show(new ObjectExamples()));
	}
}
