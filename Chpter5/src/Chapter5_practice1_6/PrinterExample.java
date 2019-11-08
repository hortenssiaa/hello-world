package Chapter5_practice1_6;

import java.util.Scanner;

public class PrinterExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPrints=0;
		int printerType=0;
		Printer p;
		
		System.out.print("Printer<1>, InkJet Printer<2>, Laser Printer<3> >>");
		printerType=sc.nextInt();
		
		System.out.print("인쇄 매수:");
		numPrints=sc.nextInt();
		
		switch(printerType){
			case 1: //Printer
				p=new Printer(numPrints, "BCP212", "Kangnam", "USB");
				p.print();
				break;
			case 2: //InkJet Printer
				p=new InkjetPrinter(numPrints, "IJP331", "Kangnam", "parallel");
				p.beforePrint();
				break;
			case 3: //Laser Printer
				p=new LaserPrinter(numPrints, "LSP579", "Kangnam", "parallel");
				p.beforePrint();
				break;
		}
		
	}
	
}
