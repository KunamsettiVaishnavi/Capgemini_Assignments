package Lab3;

import java.util.Scanner;

public class Positive8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = sc.next();
		checkPositive(str);
		}
public static void checkPositive(String str) {
	int flag = 0;
	for(int i =0;i < str.length();i++) {
		if(str.charAt(i)  > str.charAt(i+1)) {
			flag = 1;
			}else {
				break;
				}
		}
	if(flag == 0)
		System.out.println("Given String is a Positive String");
	else
		System.out.println("Given String is not a Positive String");


		}


}
