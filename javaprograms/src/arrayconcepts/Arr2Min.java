package arrayconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int i,temp=0;
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		System.out.println("enter the elements");
		for(  i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		int sm1=Integer.MAX_VALUE;
		int sm2=Integer.MAX_VALUE;
		for(  i=0;i<arr.length;i++)
		{
			if(sm1>arr[i])
			{
				sm2=sm1;
				sm1=arr[i];
			}
			else	if(sm1<arr[i] && sm2>arr[i])
			{
				sm2=arr[i];
			}
		
		}
		System.out.println(sm2);
	}
	
	}


