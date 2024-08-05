package javaprograms;

import java.util.Scanner;

public class ArrFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,visited=-1;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[arr.length];
		System.out.println("enter the elements");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			//14141
		}
		for(i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr1[j]=visited;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
				}
				
			}
			if(arr1[i]!=visited)
			{
				arr1[i]=count;
			}
		}
		
		for(i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=visited)
			System.out.println("frequency of "+ arr[i]+"     " + arr1[i]);
		}
	}

}
