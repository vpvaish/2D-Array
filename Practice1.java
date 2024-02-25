package Double_Array;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		
//		decalre
		int array2[][] = new int[3][];
		
//		creation 
		array2[0] =  new int[3];
		array2[1] = new int[4];
		array2[2] = new int[2];
		
//		Initialization 
		for(int i=0; i<array2.length;i++) {
			System.out.println("Enter 1D Array : " + (i+1));
			for(int j=0; j<array2[i].length;j++) {
				System.out.println("Enter Elements for Array : " + (j+1) + " ");
				array2[i][j] = sc.nextInt();
			}
		}
		
//		Traversing
		for(int i=0; i<array2.length;i++) {
			for(int j=0; j<array2[i].length;j++) {
               System.out.print(array2[i][j]+ " ");						
			}
			System.out.println();
		}
		
		

	}

}
