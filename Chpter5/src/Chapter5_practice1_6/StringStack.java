package Chapter5_practice1_6;

import java.util.Scanner;

interface Stack {
	int length();
	Object pop(); //Object자리에 본인이 원하는 아무 type이나 사용 가능!!!!!
	boolean push(Object ob);
}

public class StringStack implements Stack{
	static Scanner sc = new Scanner(System.in);
	static int stackSize;
	static int pointer;
	static String stackArray[];
	
	public StringStack() {
		
	}
	
	public StringStack(int stackSize) {
		this.stackSize=stackSize;
		stackArray = new String[this.stackSize];
		pointer=-1;
		
		for(int i=0; i<stackArray.length; i++)
			stackArray[i]=null;
	}
	
	public int length(){
		return stackArray.length;
	}
	
	public static boolean push(Object ob){
		if(isEmpty()){
			pointer++;
			getString();
			return true;
		} else //if there are no space to push
			return false;
		return true;
		
		
	}
	
	public static void getString(){
		if(stackArray[pointer].equals(null)){
			System.out.print("Write String>>");
			stackArray[pointer]=sc.nextLine();
		}
	}	
	
	public static boolean isEmpty(){
		/*if(pointer == -1 || stackArray[pointer].equals(null)){ //배열전체가 null || 가리키는 그 주소의 배열의 값이 없을때
			return true;
		} else if(pointer >= stackSize){ //point >= 5;
			return false;
		} else if(-1<pointer && pointer<stackSize){ //-1<point<5
			return true;
		} else{
			return false;
		}*/
		
		return (pointer == -1);
	}
	
	/*public static boolean popEmpty(Object ob){
		if(stackArray[pointer] != null || !(pointer==-1)) //null이 아니면! 즉, 안에 값이 있으면
			return true;
		else
			return false;
		
	}*/
		
	public static Object pop(){
		if(isEmpty()){
			System.out.println("This stack is Empty!");
			return 0;
		}else {
			System.out.println("Current value of the stackArray["+pointer+"] >>"+stackArray[pointer]+" is about to get deleted.");
			stackArray[pointer]=null;
			return 0;
		}
	}
	
	public static void printStack(){
		for(int i=0; i<=pointer; i++)
			System.out.print(stackArray[pointer]+"\t");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0;
		int count=-1;
		int stSize = 5;
		
		do{
			System.out.print("Push<1>, Pop<2>, Stack Length<3>, Exit<4> >>");
			menu = sc.nextInt();
			
			switch(menu){
				case 1:
					if(push(new StringStack(stSize))){//이것이 실행될때 생성자먼저 호출됨{
						System.out.println("Pushing has been completed!");
						printStack();
						count++;
					}
					break;
					
				case 2:
					if(pop().equals(0))
						System.out.println("The Stack is Empty.");
					else{
						printStack();
					}
					break;
					
				case 3:
					System.out.println("The size of the String Stack>>"+StringStack.stackSize);
					break;
				case 4:
					System.exit(0);
					break;
			}
		}while(count<stSize);
		
	}

}
