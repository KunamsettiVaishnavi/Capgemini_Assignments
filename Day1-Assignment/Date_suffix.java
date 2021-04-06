package day1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int date = sc.nextInt();
		if(date>=1 && date<=31) {
			if(date>=11 && date<=13) {
				System.out.println("Date is :"+Integer.toString(date)+"th");
			}else {
				switch(date%10){
				case 1:
					System.out.println("Date is :"+Integer.toString(date)+"st");
					break;
				case 2: 
					System.out.println("Date is :"+Integer.toString(date)+"nd");
					break;
				case 3: 
					System.out.println("Date is :"+Integer.toString(date)+"rd");
					break;
				default:
					System.out.println("Date is: "+Integer.toString(date)+"th");
		}
		
		}	
	}
		else {
			System.out.println("Invalid Input");
		}
	}
}
