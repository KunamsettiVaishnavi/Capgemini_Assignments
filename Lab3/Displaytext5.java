package Lab3;

import java.util.Scanner;

public class Displaytext5 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		int lcount=0; 
		int wcount = 0;
		for(int i = 0; i < s.length(); i++) {    
			if(s.charAt(i) != ' ') {
				lcount++;    
			}
		}
		System.out.println("Number of letters : "+lcount);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				wcount++;
			}
		}
		System.out.println("Number of Words : "+(wcount + 1));
	}

}
