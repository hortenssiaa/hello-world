package examples;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());//생성 후 스트링버퍼 해시값 출력 
		
		sb.append(" is pencil");
		System.out.println(sb);//This is pencil
		
		sb.insert(7, " my");
		System.out.println(sb); //This is my pencil
		
		sb.replace(8, 10, "your");
		System.out.println(sb);//This is your pencil
		
		sb.setLength(5);
		System.out.println(sb);//This 
		System.out.println(sb.hashCode()); //7절에서와의 객체의 hashcode 값이 같으면 같은 객체이다. 
		//스트링 객체는 문자열 조작 후 새로운 객체가 생성되어 해시코드 값이 달라진다. 
		//해시코드는 실행 상황에 따라 다른 값이 나온다. 
	}

}
