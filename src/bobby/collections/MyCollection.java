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
			str.addAll(s.split(" "));
		}
	}
	
	public static void main(String[] args) {
		s = "In solving a problem of this sort, the grand thing is to be able to reason backwards. That is a very useful accomplishment, and a very easy one, but people do not practice it much. In the every-day affairs of life it is more useful to reason forwards, and so the other comes to be neglected. There are fifty who can reason synthetically for one who can reason analytically.";
		stringIterate(s);
	}

}



//Create a collection as an instance of ArrayList class. Tokenize the following string by delimiter “  , .”  (blank space, comma and a dot): 
//
//In solving a problem of this sort, the grand thing is to be able to reason backwards. That is a very useful accomplishment, and a very easy one, but people do not practice it much. In the every-day affairs of life it is more useful to reason forwards, and so the other comes to be neglected. There are fifty who can reason synthetically for one who can reason analytically.
//
//(The above quote is from Sir Arthur Conan Doyle - Sherlock Holmes, in "A Study in Scarlet")
//
//Create the list with the tokens populated from the above string. Verify that the collection is not empty. Find the size of the collection. 
//
//Iterate over this unsorted list. Do reverse iteration over this unsorted list. Make the list iteration in natural sorting order. Make the list iteration in case insensitive sorting order. 
//
//Remove couple of tokens from the collection and iterate again. Clear the collection. Check if it is empty and its size.
//
//Print output from all the above operations to the standard output.
