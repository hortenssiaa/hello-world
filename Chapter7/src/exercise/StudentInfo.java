package exercise;

import java.util.*;

public class StudentInfo {
	String name;
	String major;
	String id;
	double grade;
	
	public StudentInfo() {
	}
	
	public StudentInfo(String n, String m, String i, double g) {
		name=n; major=m; id=i; grade=g;
	}
	
	public String getMajor(){ return major;}
	protected String getId(){ return id;}
	protected double getGrade(){ return grade;}
	
	protected void lookUpStuInfo(HashMap<String, StudentInfo> h, String name){	
		if(h.get(name) != null){
			if(name.equals(name))
				System.out.println(name+"\t"+h.get(name).getMajor()+"\t"+h.get(name).getId()+"\t"+h.get(name).getGrade()+"\n");
		} else //if the recieved parameter 'name' is wrong one 
			System.out.println(name+" Dosen't Exist.\n");
	}
}
