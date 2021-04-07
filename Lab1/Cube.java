package Lab1;

import java.util.Scanner;

public class Cube1 {
	public static int cubes(int n) {
		int r,sum=0;
		while(n!=0){
			r=n%10;
			sum+=r*r*r;  //cube of each digit
			n/=10;
		}
		return sum;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		System.out.println("Cube is: ");
		System.out.println(cubes(n));
		
	}

}
