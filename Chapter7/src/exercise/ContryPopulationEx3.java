package exercise;

import java.util.*;

public class ContryPopulationEx3 {
	
	protected void getContry(HashMap<String, Double> h, String contry){
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		if(h.get(contry) != null){//if h.get(c) is not null
			while(it.hasNext()){
				String c=it.next();
				if(contry.equals(c)){
					System.out.println("The population of "+contry+" is "+h.get(c)+"\n");
					break;
				}
			}
		}else
			System.out.println(contry+" doesn't exist.\n");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> population = new HashMap<String, Double>(10);
		ContryPopulationEx3 cp;

		try{
			System.out.println("Write 10 Contry Name And Population Of The Contry!");
			for(int i=0; i<10; i++){
				System.out.print("["+(i+1)+"] Contry >>");
				String country=sc.next();
				System.out.print("["+(i+1)+"] Population >>");
				double popu=sc.nextDouble();
				System.out.println();
				
				population.put(country, popu);
			}
		}catch(InputMismatchException e){
			System.out.println("You Have Written Wrong Number!\n");
		}
		
		while(true){
			System.out.print("LOOK UP<1>, EXIT<2> >>");
			int menu=sc.nextInt();
			
			if(1<=menu && menu<=2){
				try{	
					switch(menu){
						case 1:
							cp = new ContryPopulationEx3();
							System.out.print("Write the contry you want to know the population >>");
							String c = sc.next();
								
							cp.getContry(population, c);
							break;
						case 2:
							sc.close();
							System.exit(0);
							break;
					}
				}catch(InputMismatchException e){
					System.out.println("You Have Written Wrong Number!\n");
					break;
				}
			}else
				System.out.println("You Have Written Wrong Number!\n");
		}
	}
		
}

/*
Write 10 Contry Name And Population Of The Contry!
[1] Contry >>S.Korea
[1] Population >>5170.9098

[2] Contry >>N.Korea
[2] Population >>2458.9122

[3] Contry >>Canada
[3] Population >>3741.1047

[4] Contry >>Japan
[4] Population >>1286.301

[5] Contry >>Slovakia
[5] Population >>545.7013

[6] Contry >>Germany
[6] Population >>8351.7045

[7] Contry >>US
[7] Population >>32906.4917

[8] Contry >>UK
[8] Population >>6753.172

[9] Contry >>Mexico
[9] Population >>12757.5529

[10] Contry >>Ireland
[10] Population >>488.2495
*/

