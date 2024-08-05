package patterns;

import java.util.Scanner;

public class Numpat8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,p;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		n=scanner.nextInt();
		for(i=1,p='A';i<=n;i++,p++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<i;j++)
				
			{
				System.out.print((char)p+" ");
			}
			for(j=1;j<=i;j++)
				
			{
				System.out.print((char)p+" ");
			}
			System.out.println("  ");
		}
		
	}

}
