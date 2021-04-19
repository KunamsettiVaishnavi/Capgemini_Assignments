package Lab5.ex3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InvalidSalaryException, ValidSalaryException {
		Scanner sc = new Scanner(System.in);
		double sal = sc.nextDouble();
		EmployeeException v = new EmployeeException();
		v.checkSalary(sal);
		// TODO Auto-generated method stub

	}

}
