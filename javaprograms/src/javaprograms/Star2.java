package javaprograms;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				System.out.println("enter the num");
				int n=scanner.nextInt();
				for(int i=1;i<=n;i++)
				{
					for(int j=n;j>=i;j--)
					{
						System.out.print("*");
					}
					System.out.println();
				}

			}		


	}


