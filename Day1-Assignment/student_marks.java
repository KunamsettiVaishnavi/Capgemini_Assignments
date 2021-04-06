package day1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int english_marks=sc.nextInt();
		int java=sc.nextInt();
		int db=sc.nextInt();
		int springtools=sc.nextInt();
		float total = english_marks+java+db+springtools;
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: "+total/4);
		

	}

}
