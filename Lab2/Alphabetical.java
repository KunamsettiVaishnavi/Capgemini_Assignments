package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabetical {

	public static void main(String[] args) {
		int n;
		Alphabetical two = new Alphabetical();		
		System.out.println("Number of Elements in the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		two.sortStrings(arr);
		
		
	}
	
	public String[] sortStrings(String arr[]) {
		Arrays.sort(arr);
		
		
		
		return arr;
	}
}