package Chapter5_practice1_6;

public class Printer {
	private String model;
	private String manufacture;
	private String interfaceType;
	private int numOfPrints=0; //인쇄 매수
	private int Sheets=50; //인쇄 종이 잔량
	
	protected String getModel() {return model;}
	protected String getManufacture() {return manufacture;}
	protected String getInterfaceType() {return interfaceType;}
	protected int getNumofPrints() {return numOfPrints;}
	protected int getSheets() {return Sheets -=numOfPrints;}
	
	public Printer(int n, String mo, String ma, String inter){
		numOfPrints=n;
		model = mo;
		manufacture = ma;
		interfaceType = inter;
		System.out.println("Model>> "+getModel());
		System.out.println("Manufacture>> "+getManufacture());
		System.out.println("Interface>> "+getInterfaceType());
	}
	protected void beforePrint(){print();}
	protected void print(){
		System.out.println("Number of copies>> "+getNumofPrints());
		System.out.println("Remains of Sheets>> "+getSheets());
	}
}
