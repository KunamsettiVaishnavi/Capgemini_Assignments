package Lab1;
import java.util.Scanner;
public class Increasing {
	public static boolean CheckNumber(int num) {
		boolean f=false;
		int n = num % 10;
		num /= 10;
		while(num > 0) {
			if(n <= (num%10)) {
				f=true;
				break;
			}
			n = num % 10;
			num /= 10;
		}
		return f;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number :");
		num=s.nextInt();
		if(CheckNumber(num)) {
			System.out.println("Digits are not in increasing order");
		} else {
			System.out.println("Digits are in increasing order");
		}
	}
}

	