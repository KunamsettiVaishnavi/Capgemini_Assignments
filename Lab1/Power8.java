package Lab1;

import java.util.Scanner;

public class Power8 {

	public static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
         
        while (n != 1){
            if (n % 2 != 0)  //divisability
                return false;
            n = n / 2;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n :");
		int n=sc.nextInt();
		if(isPowerOfTwo(n)) {
			System.out.println("Number is power of 2");
		}
		else {
			System.out.println("Number is not power of 2");
		}
	}
}
