package javaprograms;

import java.util.Scanner;

public class Larof3Num{

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the range");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int c=scanner.nextInt();
			int x=(a>b)?a:b ;
			int y=(x>c)?x:c ;
			System.out.println("largest "+y);
		}

	}


