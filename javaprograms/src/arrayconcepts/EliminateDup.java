package arrayconcepts;

import java.util.Scanner;

public class EliminateDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int i,temp,count=0,dup=-1;
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		System.out.println("enter the elements");
		for(  i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(  i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
		
				        arr[j]=dup;
	}
			}
		}
		for(  i=0;i<arr.length;i++)
		{
				if(arr[i]!=dup)
				{
					System.out.println(arr[i]);
				}

		}
		}
	}


