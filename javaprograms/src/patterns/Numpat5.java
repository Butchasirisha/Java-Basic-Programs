package patterns;

import java.util.Scanner;

public class Numpat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,p;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		n=scanner.nextInt();
		for(i=0,p=1;i<n;i++,p++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(p+" ");
			}
			for(j=1;j<=i;j++)
				
			{
				System.out.print(" ");
			}
			System.out.println("  ");
		}
		
	}

}
