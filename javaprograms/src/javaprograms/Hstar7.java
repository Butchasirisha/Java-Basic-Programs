package javaprograms;

import java.util.Scanner;

public class Hstar7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
				for(int k=1;k<=i;k++)
				{
					if(i==n || i==k||k==1 )
					{
					System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
}
			System.out.println();
		}
	}

}
