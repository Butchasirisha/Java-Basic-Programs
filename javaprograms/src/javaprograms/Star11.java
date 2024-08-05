package javaprograms;

import java.util.Scanner;

public class Star11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				/*if(i>=2 && j<=i-1 )
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}*/
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
	}

}
}