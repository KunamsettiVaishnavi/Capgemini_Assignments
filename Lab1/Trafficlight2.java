package Lab1;

public class Trafficlight2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("The Colour of light is: ");
		String s = sc.next();
		
		if (s.equalsIgnoreCase("Red")) //case sensitive
		{
			System.out.print("Stop");
		}
		else if (s.equalsIgnoreCase("Green"))
		{
			System.out.print("go");
		}
		else{
			System.out.print("Ready");
		}
			
		}

	}
