package MatrixConcepts;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int sum=0,codd=0,ceve=0,count=0;
		
		System.out.println("enter the no of rows");
		int r1=scanner.nextInt();
		System.out.println("enter the no of columns");
		int c1=scanner.nextInt();
		int[][] arr1=new int[r1][c1];
		int size=r1*c1;
		System.out.println("enter the elements");
		for( int  i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=scanner.nextInt();
			}
		}	
		for( int  i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
		if(arr1[i][j]==0)
		{
			count++;
		}
	   }
		}
		if(count>size/2)
		{
			System.out.println("sparse");
		}
		else {
			System.out.println("not a sparse matrix");
		}
		}
}
