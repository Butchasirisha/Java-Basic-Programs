import java.util.Scanner;

public class MaxAndSecMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of values");
		int n=scanner.nextInt();
		int[] arr=new int[n];
	int max1,i;
	int max2;
		System.out.println("enter values");
		for( i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();	
			}
		if(arr[0]>arr[1])
		{
		max1=arr[0];
	 max2=arr[1];
	    }
		else {
			max1=arr[0];
			 max2=arr[1];
		}
		for( i=0;i<n;i++)
		{
		if(arr[i]>max1)
		{
			max2=max1;
			max1=arr[i];
		}
		else if(arr[i]>max2 && arr[i]<max1)
		{
			max2=arr[i];
		}
		}
		System.out.println("max is"+max1);
		System.out.println("second max is"+max2);

}
	}

