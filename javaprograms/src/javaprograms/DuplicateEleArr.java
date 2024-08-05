package javaprograms;

import java.util.Scanner;

public class DuplicateEleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					dup[i]=arr[j];
				}
			}
		}
		for(int i=0;i<dup.length;i++)
		{
			if(dup[i]!=0)
			System.out.println("duplicates are"+dup[i]);
		}
		
		}
	}


