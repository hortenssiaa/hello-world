package examples;

public class MathEx {

	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			System.out.print(Math.round(1+Math.random()*44)+" "); //난수 발생
			/*
			 * Math.random() : 0.0~0.999 범위까지
			 * Math.random()*44 : 0.0~43.9** 범위까지
			 * 1+Math.random()*44 : 1.0~44.9** 범위까지
			 * Math.round(1+Math.random()*44) : 1.0~45.0 범위까지
			 */
		} System.out.println("입니다.");
		System.out.println(Math.min(-10.5, -13));
		System.out.println(Math.max(64, -13));
	}

}
