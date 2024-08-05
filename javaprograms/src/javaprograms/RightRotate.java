package javaprograms;

import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
int temp;
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
			 temp = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]+"  ");
		}

		scanner.close();
	
	}
}
