package arrayconcepts;

import java.util.Scanner;

public class OddIndexedEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[arr.length];
		System.out.println("enter the elements");
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();	
		}
		for( int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				arr1[i]=arr[i];
			}
		}
		for( int i=0;i<arr.length;i++)
		{
			if(arr1[i]!=0)
			System.out.println(arr1[i]);
		
	}
	}

}
