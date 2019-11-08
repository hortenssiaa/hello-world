package practice4_4;

public class ArrayUtility {
	static double[] storageD;
	static int[] storageI;
	
	static double[] intToDouble(int[] source){ //int배열을 double 배열로 변환
		storageD = new double[source.length];
		for(int i=0; i<source.length; i++)
			storageD[i] = source[i];
		return storageD;
	}
	
	static int[] doubleToInt(double[] source){ //double배열을 int배열로 변환
		storageI = new int[source.length];
		for(int i=0; i<source.length; i++)
			storageI[i] = (int) source[i];
		return storageI;
	}
	
	public static void main(String[] args) {
		int[] intArray= {30, 4, 54, 10, 9};
		double[] doubleArray= {55.4, 69.0, 8.3, 2.2, 5.0};
		ArrayUtility.intToDouble(intArray);
		ArrayUtility.doubleToInt(doubleArray);
		
		System.out.println("intArray원소들을 double로 바꾼 값들은>> ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(ArrayUtility.storageD[i]+" ");
		System.out.println();
		
		System.out.println("doubleArray원소들을 int로 바꾼 값들은>> ");
		for(int i=0; i<doubleArray.length; i++)
			System.out.print(ArrayUtility.storageI[i]+" ");
	}
}
