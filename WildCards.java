package GenericsPractice;

import java.util.List;

public class WildCards{
	public static <T> void checkList(List<? extends Number> list, T obj ) {
		if(list.contains(obj)) {
			System.out.println("The list contains the element: "+obj);
		}
		else {
			System.out.println("The list doesn't contain the element: "+obj);
		}
	}

}
