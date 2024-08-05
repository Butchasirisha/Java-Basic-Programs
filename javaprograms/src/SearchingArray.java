import java.util.Scanner;

public class SearchingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int flag=0;
		System.out.println("enter the no of values");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();	}
		System.out.println("enter key");
		int key=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			if(key==arr[i])
			{
				flag=1;
			}
			
			}
		if(flag==1)
		{
			System.out.println("key found" + key);
		}
		else {
			System.out.println("key  not found" );
		}
	}
}
