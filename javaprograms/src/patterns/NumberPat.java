package patterns;
//increasing triangle row increment

import java.util.Scanner;

public class NumberPat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n,i,j,p;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the num");
	n=scanner.nextInt();
	for(i=0,p=1;i<n;i++,p++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(p+" ");
		}
		System.out.println(" ");
	}
	
	}

}
