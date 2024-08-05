package arrayconcepts;

import java.util.Scanner;

public class EvenOddArr {

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
		for(  i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even numbered"+arr[i]);
			}
			else {
				System.out.println("odd numbered"+arr[i]);
			}
			
		}
	
		
	}

}
