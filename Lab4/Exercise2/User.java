package Lab4.ex2;

import java.util.Scanner;

public class User{
	public static void main(String args[]) {
		
		EmployeeService es = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the User ID : ");
		int id = Integer.parseInt(sc.nextLine());
		es.setId(id);
		System.out.println("Enetr the User Name : ");
		String name = sc.nextLine();
		es.setName(name);
		System.out.println("Enetr the User Salary : ");
		double sal = Double.parseDouble(sc.nextLine());
		es.setSalary(sal);
		System.out.println("Enetr the User Designation");
		String des = sc.nextLine();
		es.setDesignation(des);
		//es.getEmployeeDetails();
		
		es.displayEmpDetails();
		System.out.println("Insurance Eligibility: ");
		es.findInsuranceschema(sal);
	}
}