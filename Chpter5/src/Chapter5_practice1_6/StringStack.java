package Chapter5_practice1_6;

import java.util.Scanner;

interface Stack {
	int length();
	String pop();
	boolean push(String s);
}

public class StringStack { 
	private String sStore;
	static int count=0;
	
	public StringStack() {sStore="0";}
	
	public int length(){return sStore.length();}
	
	public String pop(){
		if( !this.sStore.equals(null) ){
			System.out.print("Stack["+--count+"]>> "+sStore);
			sStore=null;
			return " >> is just set>> "+getsStore();
		} else
			return "This stack is empty.";
		
	}
	
	public boolean push(String s){
		if(sStore.equals("0")){
			sStore=s;
			count++;
			return true; //if it's been pushed
		} else
			return false;
	}
	
	protected String getsStore(){return sStore;}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStack[] ss = new StringStack[5];
		String sentence;
		int top=0, menu=0;
		
		do{
			System.out.print("Push<1>, Pop<2>, Exit<3> >>");
			menu=sc.nextInt();
			
			switch(menu){
			case 1:
				ss[top] = new StringStack();
				System.out.print("Write string to push>>");
				sentence=sc.next();
				
				if(ss[top].push(sentence)){
					System.out.println("Number["+top+"]>> "+sentence);
					System.out.println("Length>> "+ss[top].length());
					top++;
				} else
					System.out.println("The Stack is full.");
				break;
				
			case 2:
				while(top >=0){
					--top;
					if(top == -1){ // if case 1 hasn't get executed
						System.out.println("The stack is empty!");
						break;
					}
					if(top > -1) {
						if( !ss[top].getsStore().equals(null) ){ //if ss[i] has value, pop
							System.out.println(ss[top].pop());
							break;
						} else if(ss[top].getsStore().equals(null)){ //ss[i] doesnt have value
							System.out.println(ss[top].pop());
							break;
						}
					}
				}
				break;
				
			case 3:
				System.exit(0);
				break;
			}
			System.out.println();
		} while(top<5);			
		
	}

}
