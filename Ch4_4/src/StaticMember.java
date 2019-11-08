class CurrencConverter {
	private double rate; //$1=1170.70
	
	public void setRate(double w){rate =w;}
	public double changetoD(int x){return x*1/rate;} //rate이 1달러의 가치를 환산한 값이니깐! 다시 Dollar로 바꾸려면 나눠야게쮜
	public double changetoW(int x){return x*rate;}
}

public class StaticMember {
	public static void main(String[] args){
		CurrencConverter a = new CurrencConverter();
		a.setRate(1170.7); //그냥 $1만 setting하면 따로 변수 안만들어도 
		
		System.out.println("백만원은 "+a.changetoD(1000000)+"달러입니다."	);
		System.out.println("백달러는 "+a.changetoW(100)+"원입니다.");
	}
}