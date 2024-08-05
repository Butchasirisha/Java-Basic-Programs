package arrayconcepts;

import java.util.Iterator;
import java.util.Scanner;

public class Arr2Lar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int i,temp=0;
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(  i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		int lar1=Integer.MIN_VALUE;
		int lar2=Integer.MIN_VALUE;
		for(  i=0;i<arr.length;i++)
		{
			if(arr[i]>lar1)
			{
				lar2=lar1;
				lar1=arr[i];
			}
			else	if(lar1<arr[i] && lar2>arr[i])
			{
				lar2=arr[i];
			}
		
		}
		System.out.println(lar2);
	
	}
	
}
