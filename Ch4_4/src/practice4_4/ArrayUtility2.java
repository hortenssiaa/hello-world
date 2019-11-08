package practice4_4;

public class ArrayUtility2 {
	static int[] storeArray;
	static int[] newArray;
	
	static int[] concat(int[] s1, int[] s2){ 
		storeArray = new int[s1.length+s2.length];
		for(int i=s1.length, k=0; i<(s1.length+s2.length) && k<s2.length; i++, k++){
			for(int j=0; j<s1.length; j++)
				storeArray[j] = s1[j];
			storeArray[i] = s2[k];
		}
		return storeArray;
	}
	static int[] remove(int[] s1, int[] s2){
		newArray = new int[s1.length];
		for(int i=0; i<s1.length; i++){
			s1[i]=0;
			newArray[i] = s1[i];
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] intArray1 = {63, 9, 0, 33, 14}; //5개
		int[] intArray2 = {50, 18, 4, 23, 69, 77, 24}; //7개
		
		ArrayUtility2.concat(intArray1, intArray2);
		ArrayUtility2.remove(intArray2, intArray2);
		
		System.out.println("concat메소드를 사용하여 만든 새로운 배열 storeArray배열의 원소들은>>");
		for(int i=0; i<ArrayUtility2.storeArray.length; i++)
			System.out.print(ArrayUtility2.storeArray[i]+" ");
		System.out.println();
		
		System.out.println("remove메소드를 사용하여 만든 새로운 배열 newArray배열의 원소들은>>");
		for(int i=0; i<ArrayUtility2.newArray.length; i++)
			System.out.print(ArrayUtility2.newArray[i]+" ");		
	}

}
