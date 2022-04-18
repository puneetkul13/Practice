package JavaBasics;

public class Zoo {

	public static void main(String[] args) {
		String str  = "Hello my name is punit. my category:general and I love to play cricket. cricket comes in the category:game and it is fun. book comes in category:study and it is also fun";
		printCategories(str);
		

	}
	public static void printCategories(String s) {
		int count = 0;
		while(true) {
			
			int index  = s.indexOf("category:");
			
			if(index==-1) {
				break;
			}
			int index1 = index + ("category:").length();
			int new_count = s.length();
			String res = "";
			
			while(true) {
				res = res + s.substring(index1,index1+1);
				index1  = index1 + 1;
				if (index1 == new_count) {
					break;
				}
				if ((s.substring(index1,index1+1)).equals(" ")) {
					break;
				}
				
			}
			System.out.println(res);
			
			s  = s.substring(index1);
			count = count + 1;
			
			
		}
//		System.out.println(count);
		
	}

}
