package exercise;

import java.util.*;

public class PrintStudentInfoEx9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, StudentInfo> dept = new HashMap<String, StudentInfo>();
		
		for(int i=0; i<2; i++){
			System.out.println("["+(i+1)+"] Student");
			System.out.print("Name >> ");
			String name = sc.nextLine();
			
			System.out.print("Major >> ");
			String major = sc.nextLine();
			
			System.out.print("Student Number >> ");
			String snumber = sc.next();
			
			System.out.print("Everage Of Grade >> ");
			double grade = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			
			dept.put(snumber, new StudentInfo(name, major, snumber, grade));
		}
		
		int count=0;
		StudentInfo si = new StudentInfo();
		while(true){
			System.out.print("Student Number To Look Up >> ");
			String snum=sc.next();
			si.lookUpStuInfo(dept, snum);
		}
	}

}
