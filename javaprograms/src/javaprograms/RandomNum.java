package javaprograms;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random r=new Random();
		int n;
		for (int i=1;i<=10;i++) {
			n=r.nextInt(100);
			System.out.println("Random number is " + n + " i : " +i);
		}
			
		
	
	}

}
