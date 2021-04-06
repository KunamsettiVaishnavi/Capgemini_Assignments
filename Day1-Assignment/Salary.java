package day1;
import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		int basic;
		double res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the baisc salary:");
		basic = sc.nextInt();
		if(basic < 200000) {
			double hra = 0.4*basic;
			double da = 0.6*(basic+hra);
			res = basic + hra + da;
			System.out.println("Hra is"+hra);
			System.out.println("Da is"+da);
		}else if(basic >= 200000 && basic <= 600000) {
			double hra = 0.4*basic;
			double da = 0.6*(basic+hra);
			double tax = 0.1*basic;
			res = basic + hra + da-tax;
			System.out.println("Hra is"+hra);
			System.out.println("Da is"+da);
			System.out.println("Tax is"+tax);
			

		}else {
			double hra = 0.4*basic;
			double da = 0.6*(basic+hra);
			double tax = 0.2*basic;
			res = basic + hra + da-tax;
			System.out.println("Hra is"+hra);
			System.out.println("Da is"+da);
			System.out.println("Tax is"+tax);
			}
			
			System.out.println(res);
			// TODO Auto-generated method stub

			}

}
