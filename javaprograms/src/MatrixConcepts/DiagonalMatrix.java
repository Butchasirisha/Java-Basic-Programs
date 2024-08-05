package MatrixConcepts;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
		int sum=0;
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
		if(r1!=c1)
		{
			System.out.println("matrix is  not a square matrix");
		}
		else {
			for( int  i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(i==j)
					{
						System.out.print(arr1[i][j]+ " ");
						 sum=sum+ arr1[i][j] ;
						 
					}
					else {
						System.out.print(" ");
					}
						}
				System.out.println( );
				}
			System.out.print(sum);
	}
	}
}
