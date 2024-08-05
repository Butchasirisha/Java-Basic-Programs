package javaprograms;

import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {
		
				Scanner scanner=new Scanner(System.in);
				System.out.println("enter a  number of elements");
				int n=scanner.nextInt();
				int arr[]=new int[n];
				
			
				double avg=0.0;
				System.out.println("enter the elements");
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=scanner.nextInt();
				}
				for(int i=0;i<arr.length;i++)
				{
					int sum=0,count=0;
					for(int j=i+1;j<arr.length;j++)
					{
						sum+=arr[j];
						count++;
						
				}
					if(count>0) {
					avg=sum/count;
					if(arr[i]>avg )
					{
					
					System.out.print("["+arr[i]+"]");
					}
					}
					else {
						System.out.print("["+arr[i]+"]");
					}
					}
				scanner.close();
	}
				

}
	
