package practice4_4;

import java.util.Scanner;

class Inquiry{ //조회
	public void sitTypeList(String[] s, String[] a, String[] b){
		System.out.print("S>>> ");
		for(int i=0; i<s.length; i++)
			System.out.print(s[i]+"\t");
		System.out.println();
		
		System.out.print("A>>> ");
		for(int i=0; i<a.length; i++)
			System.out.print( a[i]+"\t");
		System.out.println();
		
		System.out.print("B>>> ");
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+"\t");
		System.out.println();
		
		System.out.println("<<조회를 완료하였습니다.>>");
		System.out.println();
	}
}
class Cancel{
	private int count=0;
	protected void sitType(int t){
		if(t == 1){
			for(int i=0; i<Reserve.getsitType_S().length; i++){
				System.out.print(Reserve.getsitType_S()[i]+" ");
			}
		}else if(t==2){
			for(int i=0; i<Reserve.getsitType_A().length; i++){
				System.out.print(Reserve.getsitType_A()[i]+" ");
			}
		}else if(t==3){
			for(int i=0; i<Reserve.getsitType_B().length; i++){
				System.out.print(Reserve.getsitType_B()[i]+" ");
			}
		}
	}
	protected void cancel(String name){ //,Reserve[] res)
		//if(res != null){
			//for(int i=0; i<res.length; i++){
			//	if(name.equals(res[i].getName())){
			//		res[i].setName("---");
			//	}
			//}
			for(int j=0; j<Reserve.getsitType_S().length; j++){
				if(Reserve.getsitType_S()[j].equals(name))
					Reserve.getsitType_S()[j] = "---";
				else if(Reserve.getsitType_A()[j].equals(name))
					Reserve.getsitType_A()[j] = "---";
				else if(Reserve.getsitType_B()[j].equals(name))
					Reserve.getsitType_B()[j] = "---";
				else
					count++;
			} if(count == Reserve.getsitType_S().length)
				System.out.println("없는 이름입니다.");
				
		//}else
		//	System.out.println("res는 null입니다.");
	}
}
class Exit{
	protected boolean exit(int n){
		if(n==4)
			return false;
		else
			return true;
	}
}

public class Reserve {
	Scanner sc = new Scanner(System.in);
	private String name;
	public static int count=0;
	private static String[] sitType_S = new String[10];
	private static String[] sitType_A = new String[10];
	private static String[] sitType_B = new String[10];
	
	public void setName(String n){
		this.name=n;
	}
	public static void setSitTypeInitialize(){
		for(int i=0; i<sitType_S.length;i++)
			sitType_S[i]="---";
		for(int i=0; i<sitType_A.length;i++)
			sitType_A[i]="---";
		for(int i=0; i<sitType_B.length;i++)
			sitType_B[i]="---";
	}
	public void setSitType(int t){
		if(t==1){
			System.out.print("S>>");
			for(int i=0; i<sitType_S.length;i++)
				System.out.print("--- ");
			System.out.println();
			
		} else if(t==2){
			System.out.print("A>>");
			for(int i=0; i<sitType_A.length;i++)
				System.out.print("--- ");
			System.out.println();
			
		} else if(t==3){
			System.out.print("B>>");
			for(int i=0; i<sitType_B.length;i++)
				System.out.print("--- ");
			System.out.println();
		}
	}
	public void isTheSitFree(int getSitType, int getSitNumber){
		if(getSitType==1){	//S석일때
			if(this.sitCondition(getSitNumber, Reserve.getsitType_S(), 
					Reserve.getsitType_A(), Reserve.getsitType_B())){
				this.setSitNum(getSitNumber, Reserve.getsitType_S(), 
						Reserve.getsitType_A(), Reserve.getsitType_B());
			}	
			else {
				do{
					System.out.print("이미 예약된 번호입니다. 좌석번호 선택>>	");
					getSitNumber = sc.nextInt();
					if(this.sitCondition(getSitNumber, Reserve.getsitType_S(), 
							Reserve.getsitType_A(), Reserve.getsitType_B())){
						this.setSitNum(getSitNumber, Reserve.getsitType_S(), 
								Reserve.getsitType_A(), Reserve.getsitType_B());
						break;
					}
				} while(!this.sitCondition(getSitNumber, Reserve.getsitType_S(), 
						Reserve.getsitType_A(), Reserve.getsitType_B()));			
			}
		} else if(getSitType==2){	//A석일때
			if(this.sitCondition(getSitNumber, Reserve.getsitType_A(), 
					Reserve.getsitType_S(), Reserve.getsitType_B())){
				this.setSitNum(getSitNumber, Reserve.getsitType_A(), 
						Reserve.getsitType_S(), Reserve.getsitType_B());
			}	
			else {
				do{
					System.out.print("이미 예약된 번호입니다. 좌석번호 선택>>	");
					getSitNumber = sc.nextInt();
					if(this.sitCondition(getSitNumber, Reserve.getsitType_A(), 
							Reserve.getsitType_S(), Reserve.getsitType_B())){
						this.setSitNum(getSitNumber, Reserve.getsitType_A(), 
								Reserve.getsitType_S(), Reserve.getsitType_B());
						break;
						}
				} while(!this.sitCondition(getSitNumber, Reserve.getsitType_A(), 
						Reserve.getsitType_S(), Reserve.getsitType_B()));			
			}
		} else if(getSitType==3){	//B석일때
			if(this.sitCondition(getSitNumber, Reserve.getsitType_B(), 
					Reserve.getsitType_A(), Reserve.getsitType_S())){
				this.setSitNum(getSitNumber, Reserve.getsitType_B(), 
						Reserve.getsitType_A(), Reserve.getsitType_S());
			}	
			else {
				do{
					System.out.print("이미 예약된 번호입니다. 좌석번호 선택>>	");
					getSitNumber = sc.nextInt();
					if(this.sitCondition(getSitNumber, Reserve.getsitType_B(), 
							Reserve.getsitType_A(), Reserve.getsitType_S())){
						this.setSitNum(getSitNumber, Reserve.getsitType_B(), 
								Reserve.getsitType_A(), Reserve.getsitType_S());
						break;
					}
				} while(!this.sitCondition(getSitNumber, Reserve.getsitType_B(), 
						Reserve.getsitType_A(), Reserve.getsitType_S()));			
			}
		}
	}
	
	boolean sitCondition(int n, String[] s, String[] a, String[] b){ //그 자리에(S석||A석||B석) 예약이 있는지 판별
		if(s[n-1].equals("---") && a[n-1].equals("---") && b[n-1].equals("---"))		 //그 자리에 예약X
			return true;
		else 					//그 자리에 예약O
			return false;
	}
	
	public void setSitNum(int n, String[] s, String[] a, String[] b){ 

		//setSitNum 메소드 : sitCondition메소드 사용후 입력한 자리에 좌석이 있다면 추가!
		if(s[n-1] != null && a[n-1] != null && b[n-1] != null){
			if(s[n-1].equals("---") && a[n-1].equals("---") && b[n-1].equals("---")){ 
				s[n-1]=this.name;
			} else{
				System.out.println("이미 예약된 번호입니다. 좌석번호 선택>>");
			}
		}
	}
	
	public static boolean checkSitNumber(int n){
		if(n>10)
			return false;
		else
			return true;
	}
	
	public static boolean checkMenuNumber(int n){
		if(n==0 || n>5)
			return false;
		else
			return true;
	}
	
	public static String[] getsitType_S(){return sitType_S;}
	public static String[] getsitType_A(){return sitType_A;}
	public static String[] getsitType_B(){return sitType_B;}
	public String getName(){return this.name;}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int getSitNumber = 0;
		int getSitType=0;
		String getValue;
		int menuNum=0;
		int i=0;
		Reserve[] r1 = new Reserve[10];
		Exit exit = new Exit();
		Inquiry inq = new Inquiry();
		Cancel cl = new Cancel();
		
		Reserve.setSitTypeInitialize();
		System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4)>>>");
		menuNum=sc.nextInt();
		if(Reserve.checkMenuNumber(menuNum)){
			
			LABEL:
			do{	
				if(menuNum == 3){ //cancel
					System.out.print("좌석구분 S(1), A(2), B(3)>>>");
					getSitType=sc.nextInt();
					cl.sitType(getSitType);
					System.out.println();
					
					System.out.print("이름>>");
					getValue=sc.next();
					cl.cancel(getValue);
				}
				
				if(menuNum == 2){ //inquiry
					inq.sitTypeList(Reserve.getsitType_S(), Reserve.getsitType_A(), Reserve.getsitType_B());
				}
				
				if(menuNum == 1){ //reservation
					r1[i] = new Reserve();  ///이게 문제였어!!!r1에 NULL값 들어있게 한!!!!헐
					
					System.out.print("좌석구분 S(1), A(2), B(3)>>>");
					getSitType=sc.nextInt();
					r1[i].setSitType(getSitType);
					
					System.out.print("이름>>");
					getValue=sc.next();
					r1[i].setName(getValue);	
						
					System.out.print("좌석번호 선택(1~10번)>>");
					getSitNumber = sc.nextInt();
					if(Reserve.checkSitNumber(getSitNumber)){
						if(getSitType==1)		 //S석일때
							r1[i].isTheSitFree(getSitType, getSitNumber);
						else if(getSitType==2)	//A석일때
							r1[i].isTheSitFree(getSitType, getSitNumber);
						else if(getSitType==3)	//B석일때
							r1[i].isTheSitFree(getSitType, getSitNumber);
					} else{
						System.out.println("없는 번호입니다.");
						i--; Reserve.count--;
					}
						
					i++; Reserve.count++;
					if(i>10){
						System.out.println("모든 좌석이 매진되었습니다.");
						break LABEL;	
					}
				}
				
				
				System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4)>>>");
				menuNum=sc.nextInt();
				if(Reserve.checkMenuNumber(menuNum))
					continue;
				else
					break LABEL;
				
			} while(exit.exit(menuNum));
		} else
			System.out.println("없는 메뉴입니다.");
	}

}