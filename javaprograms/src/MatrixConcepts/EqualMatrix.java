package MatrixConcepts;

import java.util.Scanner;

public class EqualMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int flag=0;;
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
		int[][] arr2=new int[r2][c2];
		System.out.println("enter the elements");
		for( int  i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				arr2[i][j]=scanner.nextInt();
			}
			
		}	
			for( int  i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(arr1[i][j]!=arr2[i][j])
					{
						flag=1;
						
						}
				}
	}
			if(flag==0)
			{
				System.out.println("equal");
			}
			else {
				System.out.println("unequal");
			}
	}
}
