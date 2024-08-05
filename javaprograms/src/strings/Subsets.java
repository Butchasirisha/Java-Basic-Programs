package strings;

import java.util.Scanner;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scanner.nextLine();
		int n=s.length();
		String[] arr=new String[(n*(n+1))/2];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				arr[temp]=s.substring(i, j+1);
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
