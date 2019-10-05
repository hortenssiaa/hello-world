
public class NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringNumber[] = {"23.3", "12", "998.0", "3.141592"};
		try {
			for(int i=0; i<stringNumber.length; i++) {
				double j = Double.parseDouble(stringNumber[i]);
				System.out.println("숫자로 변환된 값은 "+j);
			}
		} catch(NumberFormatException e) {
			System.out.println("실수로 변환할 수 없습니다.");
		}
	}
//문자열을 정수(int)로 변환할 때는 정수보다 큰 '실수' 는 정수로 변환이 불가능하다!!
	//그러나 문자열에 있는 수 중에 정수 실수(duble/float)로 변환이 가능하다!!
}
