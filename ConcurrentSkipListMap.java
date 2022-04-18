package ConcurrentNavigableMap;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;

public class ConcurrentSkipListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.concurrent.ConcurrentSkipListMap<String, Integer> sc = new java.util.concurrent.ConcurrentSkipListMap<>();
		sc.put("java",20);
		sc.put("cpp", 40);
		sc.put("python", 60);
//		System.out.println(sc);
//		java.util.concurrent.ConcurrentSkipListMap<String, Integer> sc_clone =  sc.clone();
//		System.out.println(sc_clone);
//		System.out.println(sc.size());
//		int u = sc.computeIfAbsent("jsp", (k)->(k.length()+4));
//		System.out.println(u);
//		int v = sc.computeIfPresent("java", (k,x)->(k.length()+x));
//		System.out.println(sc);
//		int w = sc.compute("python",(k,x)->(k.length()+x));
//		int y = sc.compute("R", (k,x)->(k.length()+4));
//		System.out.println(w);
//		System.out.println(y);
//		System.out.println(sc);
//		int x = sc.merge("java",8,(k,v)->(k+v));
//		int y = sc.merge("jsp",70, (k,v)->(k+v) );
//		System.out.println(sc);
//		NavigableSet<String> keys = sc.keySet();
//		System.out.println(keys);
//		NavigableSet<String> keysn = sc.navigableKeySet();
//		System.out.println(keysn);
//		Collection<Integer> values = sc.values();
//		System.out.println(values);
//		Set<Map.Entry<String, Integer>> entry = sc.entrySet();
//		System.out.println(entry);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> desc = sc.descendingMap();
//		NavigableSet<String> desc_keys = sc.descendingKeySet();
//		System.out.println(desc);
//		System.out.println(desc_keys);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_new = new java.util.concurrent.ConcurrentSkipListMap<>();
//		sc_new.put("java", 20);
//		sc_new.put("cpp", 40);
//		sc_new.put("python", 60);
//		System.out.println(sc.equals(sc_new));
//		sc.putIfAbsent("java",100);
//		sc.putIfAbsent("jsp", 200);
//		System.out.println(sc);
//		sc.remove("java",20);
//		System.out.println(sc);
//		sc.replace("jsp", 30,40);
//		System.out.println(sc);
//		sc.replace("jsp",100);
//		System.out.println(sc);
//		Comparator<?> compare = sc.comparator();
//		System.out.println(compare);
//		String first_key = sc.firstKey();
//		System.out.println(first_key);
//		String last_key = sc.lastKey();
//		System.out.println(last_key);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_sub = sc.subMap("cpp",false,"python",true);
//		System.out.println(sc_sub);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_head = sc.headMap("java",true);
//		System.out.println(sc_head);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_tail = sc.tailMap("java",false);
//		System.out.println(sc_tail);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_sub = sc.subMap("java","python");
//		System.out.println(sc_sub);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_head = sc.headMap("java");
//		System.out.println(sc_head);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> sc_tail = sc.tailMap("java");
//		System.out.println(sc_tail);
//		Map.Entry<String, Integer> entry = sc.lowerEntry("java");
//		System.out.println(entry);
//		String lower_key = sc.lowerKey("java");
//		System.out.println(lower_key);
//		Map.Entry<String, Integer> floor_entry = sc.floorEntry("java");
//		String floor_key = sc.floorKey("java");
//		System.out.println(floor_entry);
//		System.out.println(floor_key);
//		Map.Entry<String, Integer> ceiling_entry = sc.ceilingEntry("java");
//		String ceiling_key = sc.ceilingKey("java");
//		Map.Entry<String, Integer> higher_entry = sc.higherEntry("java");
//		String higher_key = sc.higherKey("java");
//		System.out.println(ceiling_entry);
//		System.out.println(ceiling_key);
//		System.out.println(higher_entry);
//		System.out.println(higher_key);
//		Map.Entry<String, Integer> first_entry = sc.firstEntry();
//		System.out.println(first_entry);
//		Map.Entry<String, Integer> last_entry = sc.lastEntry();
//		System.out.println(last_entry);
//		Map.Entry<String, Integer> polled_first_entry = sc.pollFirstEntry();
//		System.out.println(polled_first_entry);
//		Map.Entry<String, Integer> polled_last_entry = sc.pollLastEntry();
//		System.out.println(polled_last_entry);
//		sc.forEach((k,v)->{System.out.println(k+"---"+v);});
//		sc.replaceAll((k,v)->(k.length()+v));
//		System.out.println(sc);
		
		
		
		
	}

}
