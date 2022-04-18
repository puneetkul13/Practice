package JavaBasics;

public class Multiplier {

	public int Multiply(int a) throws Exception{
		if(a>100) {
			throw new Exception("Number should be less than 100");
		}
		return a*100;
		
	}

}
