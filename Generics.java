package Generics;

import java.util.HashSet;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericExample<String,Integer> value = new GenericExample<>("hello",14);
		String var1 = value.getVar1();
		int var2 = value.getVar2();
		System.out.println(var1+" "+var2);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(4);
		HashSet<String> result = Union(set1,set2);
		System.out.println(result);
		
		
		
		

	}
	public static <E> HashSet<E> Union(HashSet set1, HashSet set2){
		HashSet<E> result = new HashSet<E>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
		
	}
}
