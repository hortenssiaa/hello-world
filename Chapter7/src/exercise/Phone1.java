package exercise;

import java.util.*;

public class Phone1{
		private String name;
		private String region;
		private String tel;
		
		public Phone1(String n, String r, String t) {		
			name=n; region=r; tel=t;
		}
		
		protected void delete(String name, HashMap<String, Phone1> h){ //<2> 삭제
			if(this.name != null){
				if(this.name.equals(name)){
					h.remove(name);
					System.out.println(name+" Has Been Deleted.\n");
				}
			}
			
		}
		
		protected void lookUpName(String name, HashMap<String, Phone1> h){ //<3> 찾기
			if(this.name != null){
				if(this.name.equals(name))
					System.out.println(this.name+"\t"+this.region+"\t"+this.tel+"\n");
			}
			
		}
		
		protected static void overAll(HashMap<String, Phone1> h){ //<4> 전체보기
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()){
				Phone1 phone = h.get(it.next());
				System.out.println(phone.name+"  "+phone.region+"  "+phone.tel);
			}
		}
		
}
