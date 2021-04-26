package Lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class problem3 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n = sc.nextInt();
		for(int i = 0;i < n;i++)
			l.add(sc.nextInt());
		System.out.println(l);
		Map<Integer, Integer> hm1 = getSquares(l);      
		for (Map.Entry<Integer,Integer> en : hm1.entrySet()) {
			System.out.println("Square of" + en.getKey() +
					" is: " + en.getValue());
			}
		}
public static Map<Integer,Integer> getSquares(List<Integer> l){
Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (Integer t : l) {
            m.put(t, (int) Math.pow(t, 2));
        }
        return m;

}


}

