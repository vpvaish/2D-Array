package Double_Array;

public class JaggedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		declaration 
		
		int[][] arr2;
		
//		Creation
		arr2 = new int[2][];
		
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		
//		Initialization 
		arr2[0][0] = 12;
		arr2[0][1] = 32;
		arr2[1][0] = 42;
		arr2[1][1] = 152;
		arr2[1][2] = 128;
		
//		Traversing
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
