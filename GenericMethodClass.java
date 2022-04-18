package GenericsPractice;

public class GenericMethodClass {
	public static <N extends Number> double add(N a, N b) {
		double sum=0;
		sum = a.doubleValue() + b.doubleValue();
		return sum;
	}
	

}
