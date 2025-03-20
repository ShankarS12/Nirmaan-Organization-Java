package day24;
import java.util.*;

public class MapEx {
	public static void main(String[] args) {
		//Map is a interface
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		LinkedHashMap<Integer,Character> LH = new LinkedHashMap<Integer,Character>();
		TreeMap<Integer,String> TM = new TreeMap<Integer,String>();
		
		//for adding a Key-value pairs
		HM.put(1000, "Shankar");
		HM.put(1001, "Surya");
		HM.put(1002, "Dhanush");
		HM.put(1003, "ajth");
		HM.put(1004, "str");
		HM.put(1005, "jk");
		HM.put(1006, "mg");
		HM.put(1007, "kk");
		HM.put(1008, "sk");
		HM.put(1009, "AA");

		//for removing a entries
		HM.remove(100);
		
		//total entries
		System.out.println(HM.keySet());
		System.out.println(HM.entrySet());
		System.out.println(HM.values());
		
		System.out.println(HM.size());
		
		LH.put(1, 'A');
		LH.put(2, 'B');
		LH.put(3, 'C');
		
		System.out.println(LH);
		
		TM.put(110, "Shankar");
		TM.put(107, "str");
		TM.put(108, "jk");
		TM.put(105, "mg");
		TM.put(102, "kk");
		
		System.out.println(TM);
	}

}
