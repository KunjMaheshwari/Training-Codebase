package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Kunj");
		map.put(2,  "Maheshwari");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Keys: "+ entry.getKey());
			System.out.println("Values: "+ entry.getValue());
		}
	}
}
