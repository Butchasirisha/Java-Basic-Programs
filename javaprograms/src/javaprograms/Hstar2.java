package javaprograms;

import java.util.Scanner;

public class Hstar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scanner=new Scanner(System.in);
				int n;
				System.out.println("enter num");
				n =scanner.nextInt();
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						if(i==n/2+1 || j==n/2+1)
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
