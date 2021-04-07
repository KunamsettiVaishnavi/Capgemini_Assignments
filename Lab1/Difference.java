package Lab1;

import java.util.Scanner;

public class Difference {

	public static int square(int n) {
		int sum=0;
		int sum1 =0;
		while(n!=0){
			sum+=n*n;  //square
			sum1+=n;
		  
			n-=1;
		}
		return sum-sum1*sum1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		System.out.println("Difference is: ");
		System.out.println(square(n));
		
	}

}