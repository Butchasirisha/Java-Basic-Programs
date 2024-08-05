package patterns;

import java.util.Scanner;

public class Numpat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,p;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		n=scanner.nextInt();
		for(i=0;i<n;i++)
		{
			p=1;
			for(j=i;j<n;j++)
			{
				System.out.print(p++ +" ");
			}
			for(j=1;j<=i;j++)
				
			{
				System.out.print(" ");
			}
			System.out.println("  ");
		}

	}

}
