package javaprograms;

import java.util.Scanner;

public class RightRotation {

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
		int c=arr[n-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=c;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);;
		}
	}

}
