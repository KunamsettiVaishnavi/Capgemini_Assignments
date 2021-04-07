package Lab1;

import java.util.Scanner;

public class Fibanocci3 {
	  
		public static void main(String args[])  
		{
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Enter the count: ");
		 int count=sc.nextInt();
		 
		 int n1=1,n2=1,n3=0;

		 //System.out.print(n1+" "+n2); //printing 1 and 1    
		   
		 for(int i=2;i<count;++i) //loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		//  System.out.print(" "+n3);    //to get the series
		  n1=n2;    
		  n2=n3;    
		 }    
		 System.out.print("The nth number is\n"+n3);
		}} 

	
	        