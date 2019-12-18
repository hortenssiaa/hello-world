package exercise;

import java.util.*;

public class TelManagemApp {
	
	protected static boolean haveSameName(String name, HashMap<String, Phone1> h){ // <1> 삽입
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()){
			if(name.equals(it.next()))
				return false;
			else
				return true;
		}
		return true; //keep adding because we dont have any contacts
	}

	public static void main(String[] args){
		HashMap<String, Phone1> contacts = new HashMap<String, Phone1>();
		Scanner sc = new Scanner(System.in);
		String name; String region; String tel;
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Contacts Application Has Been Started! We Don't Save Your Contacts On File!");
		System.out.println("---------------------------------------------------------------------------");
		
		while(true){
			System.out.print("ADD<1>, DELETE<2>, LOOK UP<3>, OVER ALL<4>, EXIT<5> : >> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
				case 1: //삽입
					System.out.print("Name>>");
					name=sc.nextLine();
					
					if(haveSameName(name, contacts)){
						System.out.print("Address>>");
						region=sc.nextLine();
						System.out.print("Phone Number>>");
						tel=sc.next();
						
						contacts.put(name, new Phone1(name, region, tel));
						System.out.println();
						break;
					} else{
						System.out.println("Sorry, You Can't Add This name. Same Name Exists\n");
						break;
					}
					
				case 2: //삭제
					System.out.print("Name>>");
					name=sc.nextLine();
					
					Phone1 p =contacts.get(name);
					if(p != null)
						p.delete(name, contacts);
					else
						System.out.println(name+" Doesn't Exist. You Got Wrong Name.\n");
					break;
					
				case 3: //찾기
					System.out.print("Name>>");
					name=sc.nextLine();
					
					Phone1 p1 = contacts.get(name); //키(name)에 매핑되는 어떤 값도 없으면 null 리턴
					if(p1 != null)
						p1.lookUpName(name, contacts);
					else
						System.out.println(name+" Doesn't Exist.\n");
					break;
					
				case 4: //전체보기
					Phone1.overAll(contacts);
					System.out.println();
					break;
				
				case 5: //종료
					System.out.println("The Application Is Closing.");
					sc.close();
					System.exit(0);
					break;
			}
		}
		
	}
}
