package javaprograms;

import java.util.Scanner;

public class CheckPerfectSquare {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int n=scanner.nextInt();
		int res=(int)Math.sqrt(n);
		if (res*res==n) {
			System.out.println(res);
	}
	else 
	{
		System.out.println("not a perfect square number");
	}

}
}
