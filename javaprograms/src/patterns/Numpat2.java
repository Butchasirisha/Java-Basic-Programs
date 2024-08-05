package patterns;
//increasing triangle decreasing rows
import java.util.Scanner;

public class Numpat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,p;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		n=scanner.nextInt();
		for(i=0,p=5;i<n;i++,p--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println(" ");
		}
		
			

}
}