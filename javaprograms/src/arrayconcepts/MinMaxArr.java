package arrayconcepts;

import java.util.Scanner;

public class MinMaxArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int i;
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(  i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			
		}
		int lar=arr[0];
		int sma=arr[0];
		for(  i=0;i<arr.length;i++)
		{
		if(arr[i]>=lar) {
			lar=arr[i];
		}
		if(arr[i]<lar && arr[i]<=sma)
		{
			sma=arr[i];
		}
		}
		System.out.println(lar);
		System.out.println(sma);
	
	}

}
