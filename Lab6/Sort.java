package Lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sort {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String,String> hm = new HashMap<String,String>();
	System.out.println("enter the values into map");
	int n = sc.nextInt();
	for(int i = 0;i < n;i++)
		hm.put(sc.next(),sc.next());
	System.out.println(hm);
	Map<String, String> hm1 = getValues(hm);
 
       
        for (Map.Entry<String, String> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }
}
public static HashMap<String, String>  getValues(HashMap<String, String> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, String> > list = new ArrayList<Map.Entry<String, String>>(hm.entrySet());
        System.out.println("Inside list"+list);
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, String> >() {
            public int compare(Map.Entry<String, String> o1,
                               Map.Entry<String, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
           
        });
        System.out.println("Afetr sorting list"+list);
         
        // put data from sorted list to hashmap
        HashMap<String, String> temp = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}