package javaprograms;

import java.util.Scanner;

public class Hstar6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				for(int k=n;k>=i;k--)
				{
					if(i==1 || k==n ||i==k)
					{
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
}
			System.out.println();
		}
	}

}
