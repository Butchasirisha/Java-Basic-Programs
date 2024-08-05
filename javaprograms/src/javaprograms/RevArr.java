package javaprograms;

import java.util.Scanner;

public class RevArr {
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the no of elements");
	int n=scanner.nextInt();
	int[] arr=new int[n];
	int[] dup=new int[arr.length];
	System.out.println("enter the elements");
	for( int i=0;i<arr.length;i++)
	{
		arr[i]=scanner.nextInt();	
	}
	for(int i=arr.length-1;i>=0;i--)
	{
	System.out.println(arr[i]);	
}
}
}