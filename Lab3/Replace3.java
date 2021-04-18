package Lab3;

import java.util.Scanner;

public class Replace3 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = sc.next();
		System.out.println("Modified String is:"+alterString(str));
		// TODO Auto-generated method stub
		}
public static String alterString(String s) {
	String res = "";
	for(int i = 0;i < s.length();i++) {
		char ch = s.charAt(i);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			res += ch;
			}else if(ch == 'Z' || ch== 'z') {
				res += ch;
				}
			else {
				int k = ch;
				k+=1;
				res += (char)k;
				}
			}
	return res;
	}
}

