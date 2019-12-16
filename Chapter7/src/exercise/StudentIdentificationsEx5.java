package exercise;

import java.util.*;

public class StudentIdentificationsEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentInfo = new ArrayList<Student>(5);
	
		for(int i=0; i<2; i++){
			System.out.println("Number ["+(i+1)+"] Student Information");
			System.out.print("Name >> ");
			String name=sc.nextLine();
			
			System.out.print("Major >> ");
			String major=sc.nextLine();
			
			System.out.print("Number >> ");
			int number=sc.nextInt();
			
			System.out.print("Grade >> ");
			double grade=sc.nextDouble();
			System.out.println();
			
			studentInfo.add(new Student(name, major, number, grade));
			sc.nextLine();
		}
		
		for(int i=0; i<2; i++){
			Student s = studentInfo.get(i);
			System.out.println(s.printStudentId(studentInfo));
		}
	}

}


