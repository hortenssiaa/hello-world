package exercise;
import java.util.*;

public class Student {
	String name;
	String major;
	int id=0;
	double grade=0;
	
	public Student(String n, String m, int i, double g) {
		name=n;
		major=m;
		id=i;
		grade=g;
	}
	
	protected String printStudentId(ArrayList<Student> a){
		return this.name+"\t"+this.major+"\t"+this.id+"\t"+this.grade;
	}
}
