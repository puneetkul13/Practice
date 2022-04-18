package GenericsPractice;

import java.util.List;

public class GenericReturnMethodClass {
	public static <N extends Number> N method1(List<N> query, int i) {
		N res = query.get(i);
		return res;
	}

}
