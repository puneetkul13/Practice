package ConcurrentNavigableMap;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;
//import java.util.concurrent.ConcurrentNavigableMap;
public class ConcurrentNavigableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps = new ConcurrentSkipListMap<String, Integer>();
		ps.put("java",10);
		ps.put("bsp", 20);
		ps.put("zython", 5);
//		System.out.println(ps);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps_new = ps.subMap("jas",true, "pass",true);
//		System.out.println(ps_new);
//		ps_new.put("wama",40);//will throw an exception..
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps_head = ps.headMap("jsp", true);
//		java.util.concurrent.ConcurrentNavigableMap<String,Integer> ps_tail = ps.tailMap("jsp",true);
//		System.out.println(ps_tail);
//		ps_tail.put("dacker", 100);
//		System.out.println(ps_tail);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps_sub = ps.subMap("ask", "jsp");
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps_head = ps.headMap("jsp");
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps_tail = ps.tailMap("java");
//		System.out.println(ps_sub);
//		System.out.println(ps_head);
//		System.out.println(ps_tail);
//		java.util.concurrent.ConcurrentNavigableMap<String, Integer> ps_desc = ps.descendingMap();
//		System.out.println(ps_desc);
//		NavigableSet<String> keys = ps.navigableKeySet();
//		System.out.println(keys);
//		NavigableSet<String> keys = ps.keySet();
//		System.out.println(keys);
//		NavigableSet<String> keys = ps.descendingKey
	
//		System.out.println(keys);
		
		
	}

}
