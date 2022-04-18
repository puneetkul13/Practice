package ConcurrentHashMap;
import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
public class ConcurrenttHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> bp = new ConcurrentHashMap<>();
		bp.put("Java",50);
		bp.put("Python", 100);
//		System.out.println(bp);
//		bp.clear();
//		System.out.println(bp);
//		bp.compute("Java", (k,v)->(v*v));
//		bp.computeIfAbsent("Cpp", (k)->(k.length()*200));
//		bp.computeIfPresent("Java", (k,v)->(v*v));
//		boolean c = bp.contains(500);
//		System.out.println(c);
//		System.out.println(bp.containsKey("cpp"));
//		System.out.println(bp.containsKey("Java"));
//		System.out.println(bp.containsValue(60));
//		System.out.println(bp.containsValue(100));
//		Set<Map.Entry<String, Integer>> hs = bp.entrySet();
//		Object [] as = hs.toArray();
//		Map.Entry<String,Integer> x = (Entry<String, Integer>) as[0];
//		String k = x.getKey();
//		System.out.println(k);
//		Enumeration<Integer> i = bp.elements();
//		while(i.hasMoreElements()) {
//			System.out.println(i.nextElement());
//		}
		ConcurrentHashMap<String, Integer> bp1 = new ConcurrentHashMap<>();
		bp1.put("jsp", 500);
		bp1.put("cpp", 300);
//		int sum=0;
//		for(Map.Entry<String, Integer> x:bp.entrySet()) {
//			sum = sum+x.getValue();
//			
//		}
//		System.out.println(sum);
//		
//		System.out.println(bp.equals(bp1));
//		System.out.println(bp.size());
//		System.out.println(bp.isEmpty());
//		bp.clear();
//		System.out.println(bp.isEmpty());
//		System.out.println(bp.get("Python"));
//		bp.putAll(bp1);
//		System.out.println(bp);
//		bp.remove("Java");
//		Set<String> keySet = bp.keySet();
//		System.out.println(bp);
//		keySet.remove("Java");
//		System.out.println(bp);
//		bp.remove("Java");
//		System.out.println(keySet);]
//		bp.put("Cpp", 100);
//		System.out.println(bp);
//		Collection<Integer> valueSet = bp.values();
//		System.out.println(valueSet);
//		valueSet.remove(100);
//		System.out.println(bp);
//		bp.remove("Python");
//		System.out.println(valueSet);
//		System.out.println(bp);
//		System.out.println(bp.hashCode());
//		System.out.println(bp.toString());
//		System.out.println(bp.putIfAbsent("cpp", 90));
		
//		bp.remove("Java",50);
//		bp.replace("Java", 50,900);
//		System.out.println(bp);
//		bp.replace("Java", 500);
//		System.out.println(bp.getOrDefault("cpp", 700));
//		System.out.println(bp.getOrDefault("Java", 700));
//		ArrayList<Integer> n = new ArrayList<Integer>();
//		bp.forEach((k,v)->{int x = k.length()*v; n.add(x); });
//		System.out.println(n);
//		bp.replaceAll((k,v)->(v*v*k.length()));
//		System.out.println(bp);
//		bp.computeIfAbsent("cpp", (k)->(k.length()*800));
//		bp.computeIfPresent("Java", (k,v)->(k.length()*4*v));
//		bp.compute("Java", (k,v)->(k.length()*700));
//		bp.merge("Java", 800, (v1,v2)->(v1));
//		System.out.println(bp.contains(80));
//		Enumeration<String> keys = bp.keys();
//		Enumeration elements = bp.elements();
//		while(keys.hasMoreElements()) {
//			System.out.println(keys.nextElement());
//			System.out.println(elements.nextElement());
//		}
//		System.out.println(bp.mappingCount());
//		Set<String> ks = bp.newKeySet(1);
//		ks.add("Java");
//		ks.add("jsp");
//		ks.add("golang");
//		System.out.println(ks);
//		System.out.println(bp);
//		ks.remove("Java");
//		Set<String> ks = bp.keySet(80);
//		ks.add("cpp");
//		System.out.println(ks);
//		ks.add("cpp");
//		bp.put("jsp", 200);
//		System.out.println(bp);
//		int sum=0;
//		sum=0;
//		bp.forEach(2, (k,v)->{System.out.println(k.length()*v);});
//		bp.forEach(2,(k,v)->(k.length()*v), (x)->{System.out.println(x);});
//		Object x = bp.search(2, (k,v)->(k.length()*v));
//		System.out.println(x);
//		int y = 0;
//		int z = bp.reduce(2,(k,v)->( k.length()*v), (x,y)->((x+y)));
//		System.out.println(z);
//		System.out.println(bp);
//		double y = bp.reduceToDouble(2, (k,v)->(k.length()*(v+0.1)), 5, (x,y)->(x+y));
//		long z = bp.reduceToLong(2, (k,v)->((long)Math.pow(v,k.length())), 90, (x,y)->(x+y));
//		int z = bp.reduceToInt(2, (k, v)->{System.out.println("Inside the lambda function");return k.length()+v;},10, (x,y)->(x+y));
		
//		System.out.println(z);
//		bp.forEachKey(2, (k)->{int x = bp.get(k);System.out.println(k+"---"+x);});
//		bp.forEachKey(2, (k)->(k.length()), (x)->{System.out.println(x*2);});
//		Object z = bp.searchKeys(2, (x)->{if(x.length()==6) {return x;}return null;} );
//		String z = bp.reduceKeys(2,(x,y)->(x+" "+y));
//		System.out.println(z);
//		int z = bp.reduceKeys(2, (k)->{int p = bp.get(k); return k.length()*p;}, (x,y)->(x+y));
//		double z = bp.reduceKeysToDouble(2, (k)->{int p = bp.get(k); int p1 = k.length()*p;return p1;}, 0, (x,y)->(x+y));
//		long z = bp.reduceKeysToLong(2, (k)->{long p = (long)Math.pow(bp.get(k), k.length()); return p;}, 20, (x,y)->(x+y));
//		int z = bp.reduceKeysToInt(2, (k)->(k.length()), 0, (x,y)->(x+y));
//		bp.forEachValue(2, (v)->{System.out.println(v);});
//		bp.forEachValue(2,(v)->(v*v),(u)->{System.out.println(u);});
//		int s = bp.searchValues(2, (v)->{if(v==100) {return v;}return null;});
//		int s = bp.reduceValues(2, (x,y)->(x+y));
//		int s = bp.reduceValues(2, (v)->(v*3),(x,y)->(x+y));
//		double s = bp.reduceValuesToDouble(2, (v)->(v*5), 0, (x,y)->(x+y));
//		long s = bp.reduceValuesToLong(2, (v)->(long)(Math.pow(v, 5)), 0, (x,y)->(x+y));
//		int s = bp.reduceValuesToInt(2, (v)->(v*5), 0, (x,y)->(x+y));
//		bp.forEachEntry(2, (e)->{String k = e.getKey(); int v = e.getValue(); System.out.println(k+"---"+v);});
//		System.out.println(s);
//		bp.forEachEntry(2, (e)->(e.getKey().length()*e.getValue()), (x)->{System.out.println(x);});
//		Map.Entry<String, Integer> f = (Map.Entry<String, Integer>) bp.searchEntries(2, (e)->{if(e.getKey().length()+e.getValue()==54) {return e;}return null;});
//		bp.put("l", 0);
//		bp.put("cpp", 20);
//		bp.put("jsp", 10);
//		ConcurrentHashMap<String, Integer> sp = new ConcurrentHashMap<>();
//		Entry<String, Integer> f = bp.reduceEntries(2, (e,x)->{String s = e.getKey()+x.getKey(); int v = e.getValue()+x.getValue();sp.put(s, v);return e; 
//		});
//		String s = bp.reduceEntries(2, (e)->(e.getKey()+"----"+e.getValue()), (x,y)->(x+" " +y+" "));
//		double s = bp.reduceEntriesToDouble(2, (e)->(e.getValue()+e.getKey().length()), 1, (x,y)->(x*y));
//		long s = bp.reduceEntriesToLong(2, (e)->((long)Math.pow(e.getValue(),e.getKey().length())), 1, (x,y)->(x*y));
//		int s = bp.reduceEntriesToInt(2, e->(e.getValue()), 0, (x,y)->(x+y));
//		System.out.println(s);
//		System.out.println(f.getKey()+"---"+f.getValue());
//		System.out.println(sp);
	}
//		System.out.println(z);
		
		
	}


