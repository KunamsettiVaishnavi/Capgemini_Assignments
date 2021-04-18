package Lab3;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = sc.next();
		//String rev = new StringBuffer(str).reverse().toString();
		String res = getImage(str);
		System.out.println(res);
		// TODO Auto-generated method stub

		}
public static String getImage(String s) {
		/*
		* String reverse = "";
		 
		 
		           for(int i = s.length() - 1; i >= 0; i--)

		  reverse = reverse + s.charAt(i);
		*/
	String rev = new StringBuffer(s).reverse().toString();
	String ans = s+"|"+rev;
	return ans;



		}
}
