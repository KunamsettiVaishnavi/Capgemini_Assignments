package Lab1;

import java.util.Scanner;

public class Prime4 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		b = sc.nextInt();
		System.out.println("Prime Numbers upto"+" "+b+"are");
		for(int i=2; i<=b; i++){
			a=0;
			for(int j=2; j<i; j++)        
			{
				if(i%j ==0)
				a=1;
			}
			if(a==0)
				
				System.out.println(i);
		}

	}

}
