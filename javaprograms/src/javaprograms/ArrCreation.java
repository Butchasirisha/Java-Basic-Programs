package javaprograms;

import java.util.Scanner;

public class ArrCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
