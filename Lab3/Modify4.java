package Lab3;

import java.util.Scanner;

public class Modify4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The Modified number is:"+modifyNumber(n));
		}
public static int modifyNumber(int n) {
	String res = Integer.toString(n);
	String val = "";
	for(int i = 0;i < res.length();i++) {
		if(i <= res.length()-2) {
			char s1 = res.charAt(i);
			char s2 = res.charAt(i+1);
			int s = (Character.getNumericValue(s1) - Character.getNumericValue(s2));
			val += Math.abs(s);
			}else {
				val += Character.getNumericValue(res.charAt(i));
				}
		}
	int i=Integer.parseInt(val);  
	return i;
	}

}
