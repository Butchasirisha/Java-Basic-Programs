package javaprograms;

import java.util.Scanner;

public class SamplePg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int i;
System.out.println("enter the array length");
int n=scanner.nextInt();
System.out.println("enter the sum");
int s=scanner.nextInt();
int[] arr=new int[n];
System.out.println("enter the elements");
for( i=0;i<n;i++)
{
	arr[i]=scanner.nextInt();
	}
int[][] out=new int[50][25];
for( i=0;i<arr.length;i++)
{
	int sum=0;
	int j=i+1;
	for( j=j;j<=arr.length;j++)
	{
		sum=arr[i]+arr[j];
		
		if(sum==s)
		{
			for( i=0;i<n;i++)
			{
				for( j=0;j<n;j++)
				{
					//out[i][j]=arr[i][j];
				}
			}
			
				
				System.out.println("the output array" +out[n]);
				
			
		
	}
		
	}
	
}

 
	}

}
