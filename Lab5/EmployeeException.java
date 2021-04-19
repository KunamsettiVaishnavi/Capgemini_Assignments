package Lab5.ex3;

public class EmployeeException {

	public static void checkSalary(double sal) throws ValidSalaryException, InvalidSalaryException {
		if(sal < 3000) {
			InvalidSalaryException invalid = new InvalidSalaryException("Insufficient Salary");
			throw(invalid);
		}else {
			ValidSalaryException valid = new ValidSalaryException("Enough Balance");
			throw valid;
		
		}
		// TODO Auto-generated method stub

	}

}
