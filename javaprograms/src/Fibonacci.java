
import java.util.Scanner;
public class Fibonacci {
 public static void main(String[] args) {
	System.out.println("enter no of series");
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int a=0,b=1,res=0;
	System.out.print(a + " " + b);
	for(int i=2;i<n;i++)
	{
		res=a+b;
		System.out.print(" " +res);
		a=b;
		b=res;
		
	}
	
}
}
