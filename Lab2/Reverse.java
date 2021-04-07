package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n, i;
		Reverse three = new Reverse ();
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Output:"+three);
		three.Sort(arr);
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public int[] Sort(int arr[]) {
		/*int rev;
		for(int i = 0; i < arr.length; i++) {
			rev = 0;
			while(arr[i] != 0) {
				int digit = arr[i] % 10;
				rev = (rev * 10) + digit;
				arr[i] /= 10;
			}
			arr[i] = rev;
		}
		*/
		Arrays.sort(arr);
		return arr;
	}
}	
