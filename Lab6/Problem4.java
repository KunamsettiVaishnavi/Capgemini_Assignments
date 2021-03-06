package Lab6;

import java.util.*;
import java.util.Map.Entry;
public class Problem4 {

public static void main(String[] args) {
	HashMap<Integer,Integer> hm = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of values you want to enter:");
	int n = sc.nextInt();
	for(int i = 0;i < n;i++)
		hm.put(sc.nextInt(), sc.nextInt());
	HashMap<Integer,String>  m = getStudents(hm);
	for (Map.Entry<Integer, String> en : m.entrySet()) {
		System.out.println("Student id is: " + en.getKey() +" and medal received based on marks is : " + en.getValue());
        }
}
public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm){
	HashMap<Integer,String> hm1 = new HashMap<>();
	Iterator<Entry<Integer,Integer>> itr = hm.entrySet().iterator();
	while(itr.hasNext()) {
		Entry<Integer,Integer> et = itr.next();
		int res = et.getValue();
		if(res >= 90)
			hm1.put(et.getKey(), "Gold");
		if(res >= 80 && res < 90)
			hm1.put(et.getKey(), "Silver");
		if(res >= 70 && res < 80)
			hm1.put(et.getKey(), "Bronze");
		}
	return hm1;
	}
}

