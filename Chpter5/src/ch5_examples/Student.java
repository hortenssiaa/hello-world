package ch5_examples;

class Person{
	int age; //default
	public String name;
	protected int height;
	private int weight;
	void setWeight(int weight){
		this.weight = weight;
	}
	int getWeight(){
		return weight;
	}
}

public class Student extends Person{
	void set(){
		age = 25;
		name = "손하경";
		height=168;
		setWeight(53);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.set();
	}

}