package javaprograms;

import java.util.Scanner;

public class ClsPrb {


			public static void main(String[] args) {
				
Scanner scanner=new Scanner(System.in);
System.out.println("enter no of elements");
int x=scanner.nextInt();
					int sum=15;
					int[] ar=new int[x];
					for(int i=0;i<ar.length;i++)
					{
						ar[i]=scanner.nextInt();
					}
					for(int i=0;i<ar.length;i++)
					{
						for(int j=i+1;j<ar.length;j++)
						{
						int n=+ar[i]+ar[j];
						if(n==sum)
						{
							System.out.println("["+" "+ar[i]+" "+ar[j]+" " +"]");
						}						
					}

				}

			}
			}