package MatrixConcepts;

import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int sum;
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
		for( int  i=0;i<r1;i++)
		{
			sum=0;
			for(int j=0;j<c1;j++)
			{
				sum+=arr1[i][j];
				
			}
			System.out.println("sum of row"+(i+1)+" "+sum);
		}
		for( int  i=0;i<c1;i++)
		{
			sum=0;
			for(int j=0;j<r1;j++)
			{
				sum+=arr1[j][i];
				
			}
			System.out.println("sum of column"+(i+1)+" "+sum);
		}

		
	}

}
