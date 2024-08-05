package MatrixConcepts;

import java.util.Scanner;

public class Matrixmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int r1=scanner.nextInt();
		System.out.println("enter the no of columns");
		int c1=scanner.nextInt();
		int[][] arr1=new int[r1][c1];
		
	
		System.out.println("enter the elements");
		for( int  i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=scanner.nextInt();
			}
			
		}
		System.out.println("enter the no of rows");
		int r2=scanner.nextInt();
		System.out.println("enter the no of columns");
		int c2=scanner.nextInt();
		System.out.println("enter the elements");
		int[][] arr2=new int[r2][c2];
		for( int  i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr2[i][j]=scanner.nextInt();
			}
			
		}
		if(r2!=c1)
		{
			System.out.println("matrix multiplication is not possible");
		}
		else {
		int[][] mul=new int[r1][c2];
		for( int  i=0;i<r1;i++)
		{	
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++) {
					
				mul[i][j]+=arr1[i][k]*arr2[k][j];
			}
			}
		}
		for( int  i=0;i<r1;i++)
		{	
			for(int j=0;j<c2;j++)
			{
	System.out.print(mul[i][j] + " ");
		}
		System.out.println();
	}

}
}
}