package ConcurrentMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcuurentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentMap<String, Integer> bp = new ConcurrentHashMap<>();
		bp.put("Java",42);
//		System.out.println(bp);
		bp.put("Python", 55);
//		int price1 = bp.get("Java");
//		int price2 = bp.get("Python");
//		System.out.println(price1);
//		System.out.println(price2);
//		int price3 = bp.getOrDefault("Java",60);
//		int price4 = bp.getOrDefault("Cpp", 60);
//		System.out.println(price3);
//		System.out.println(price4);
//		for(Map.Entry<String,Integer> entry:bp.entrySet() ) {
//			String name = entry.getKey();
//			int price = entry.getValue();
//			System.out.println(name+"----"+price);
//		}
//		bp.putIfAbsent("Java", 80);
//		bp.putIfAbsent("cpp",70);
//		System.out.println(bp);
//		bp.remove("cpp",40);
//		System.out.println(bp);
//		bp.remove("Java", 42);
//		System.out.println(bp);
//		bp.replace("Java", 42,90);
//		System.out.println(bp);
//		bp.replace("Java", 30);
//		System.out.println(bp);
//		bp.replaceAll((k, v) -> v*v);
//		System.out.println(bp);
//		bp.computeIfAbsent("Python3", k->9080 );
//		System.out.println(bp);
//		bp.computeIfPresent("Java", (k,v)->(k.length() * v));
//		System.out.println(bp);
//		bp.compute("cpp", (k,v)->{if(v==null) {
//			return null;}
//		return v;});
//		System.out.println(bp);
//		bp.merge("Python", 400, (k,v)->{if(k==null) {
//			return v*k;
//			}
//		System.out.println(k*v);
//		return v*k;
//		});
//		System.out.println(bp);
	}
}
		
	
		
		
		
		
		

	
	


