package javaprograms;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner=new Scanner(System.in);

	System.out.println("enter no of elements");
	int n=scanner.nextInt();
	int arr[]=new int[n];
	System.out.println("eneter the elemnts");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	System.out.println("enter no of positions");
	int p=scanner.nextInt();
	p=p%arr.length;
	while(p<0) {
		p=p+arr.length;
	}
	for(int l=0;l<p;l++)
	{
	int temp=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		arr[i-1]=arr[i];
	}
	arr[arr.length-1]=temp;
	
	}
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	
	
	}
scanner.close();
}
}
