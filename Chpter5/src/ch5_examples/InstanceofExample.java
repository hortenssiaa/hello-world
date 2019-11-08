package ch5_examples;

class Person1{
	
}
class Student2 extends Person1{
		
}
class Researcher extends Person1{
	
}
class Professor extends Researcher{
	
}

public class InstanceofExample {
	public static void main(String[] args) {
		Person1 jee = new Student2();
		Person1 kim = new Researcher();
		Person1 lee = new Professor();
		if(jee instanceof Student2)
			System.out.println("jee는 Student타입");
		if(jee instanceof Researcher)
			System.out.println("jee는 Researcher타입");
		if(jee instanceof Professor)
			System.out.println("jee는 Professor타입");
		if(kim instanceof Student2)
			System.out.println("kim은 Student타입");
		if(kim instanceof Professor)
			System.out.println("kim은 Professor타입");
		if(kim instanceof Researcher)
			System.out.println("kim은 Researcher타입");
		if(lee instanceof Professor)
			System.out.println("lee는 Professor타입");
		if("java" instanceof String)
			System.out.println("\"java\"는 String타입");
	}

}