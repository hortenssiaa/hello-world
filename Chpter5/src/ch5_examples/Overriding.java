package ch5_examples;

class Person_Ov{
	private String phone;
	protected void setPhone(String phone){
		this.phone=phone;
	}
	protected String getPhone(){
		return phone;
	}
}
class Professor_Ov extends Person_Ov{
	protected String getPhone(){
		return "Professor : "+super.getPhone();
	}
}


public class Overriding {

	public static void main(String[] args) {
		Professor_Ov professor = new Professor_Ov();
		professor.setPhone("011-123-1234");
		System.out.println(professor.getPhone());
		
		Person_Ov person = professor;
		System.out.println(person.getPhone());
	}

}
