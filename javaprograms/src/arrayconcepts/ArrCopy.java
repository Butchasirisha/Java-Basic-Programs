package arrayconcepts;

import java.util.Scanner;

public class ArrCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] ar=new int[arr.length];
		System.out.println("enter the elements");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for( i=0;i<ar.length;i++)
		{
		ar[i]=arr[i];
		}
		
		for( i=0;i<ar.length;i++)
		{
			
			
			System.out.println("the elemnts in arr2 are"+ar[i]);
			
		}
			

	}

}
