package arrayconcepts;

import java.util.Scanner;

public class ArrFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0 ;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] ar=new int[n];
		System.out.println("enter the elements");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			
		}
		for( i=0;i<arr.length;i++)
		{
			
			System.out.println("elements"+arr[i]);
		}
		
		for( i=0;i<arr.length;i++)
		{
			if(ar[i]==arr[i])
			break;
		}
		
		for( i=0;i<arr.length;i++)
		{
			ar[i]=arr[i];
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
				count++;

			}
			System.out.println("count of element"+arr[i]+"is"+count);
		}
		}
			
		}
		
	
	

