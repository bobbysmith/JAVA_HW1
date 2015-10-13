package bobby.collections;
import java.util.ArrayList;

public class MyCollection {
	
	private static ArrayList<String> myList = new ArrayList<String>();
	private static String s;
	
//	s.split(" ")
	
	public static void stringIterate(String s) {
		ArrayList<String> str = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == '.') {
//				System.out.println("Found it.");
//			} else {
//				System.out.println("Nope.");
//			}
			str.add(s.split(" "));
		}
	}
	
	public static void main(String[] args) {
		s = "In solving a problem of this sort, the grand thing is to be able to reason backwards. That is a very useful accomplishment, and a very easy one, but people do not practice it much. In the every-day affairs of life it is more useful to reason forwards, and so the other comes to be neglected. There are fifty who can reason synthetically for one who can reason analytically.";
		stringIterate(s);
	}

}
