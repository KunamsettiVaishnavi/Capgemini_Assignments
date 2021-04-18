package Lab5;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) throws InvalidAgeException,ValidAgeException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Validate v = new Validate();
		v.checkAge(age);
		// TODO Auto-generated method stub

	}

}
