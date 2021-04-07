package Lab1;

import java.util.Scanner;

public class Sum {
	
	static int CalculateSum(int N) {
		int s=0;
		for (int num = 1; num < N; num++) {	
			if (num % 3 == 0 || num % 5 == 0) {
				//System.out.println(num);
				s += num;
			}
		}
		return s;
	}

	
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.err.println("Enter n : ");
		int N = s.nextInt();
		
		int x = CalculateSum(N);
		System.out.println("Sum is  : "+x);
		
		
	}
}


