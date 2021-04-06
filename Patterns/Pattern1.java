package day1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		

	}
	}
