package arrayconcepts;

import java.util.Scanner;

public class ArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int i,sum=0;
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(  i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			sum+=arr[i];
			
		}
		System.out.println(sum);
		
	}

}
