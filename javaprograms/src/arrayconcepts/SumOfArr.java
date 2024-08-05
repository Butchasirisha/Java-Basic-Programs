package arrayconcepts;

import java.util.Scanner;

public class SumOfArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.println("enter the elements");
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			sum+=arr[i];
		}
		System.out.println("sum is "+sum);
		
	}

}
