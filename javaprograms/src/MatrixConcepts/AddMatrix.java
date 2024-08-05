package MatrixConcepts;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n=scanner.nextInt();
		System.out.println("enter the no of columns");
		int m=scanner.nextInt();
		int[][] arr=new int[n][m];
		System.out.println("enter the elements");
		for( int  i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=scanner.nextInt();
			}
			
		}
		System.out.println("enter the no of rows");
		int n1=scanner.nextInt();
		System.out.println("enter the no of columns");
		int m1=scanner.nextInt();
		int[][] arr1=new int[n][m];
		int[][] sub=new int[arr.length][arr1.length];
		int[][] add=new int[arr.length][arr1.length];
		System.out.println("enter the elements");
		for( int  i=0;i<n1;i++)
		{
			for(int j=0;j<m1;j++)
			{
				arr1[i][j]=scanner.nextInt();
			}
			
		}
		for( int  i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
		add[i][j]=arr[i][j]+arr1[i][j];
		
			System.out.print(add[i][j] + " ");
			
			}
		System.out.println( );
		}
		for( int  i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
		sub[i][j]=arr[i][j]-arr1[i][j];
		
			System.out.print(sub[i][j] + " ");
			
			}
		System.out.println( );
		}
	}
}
