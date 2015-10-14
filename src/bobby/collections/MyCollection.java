package bobby.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class MyCollection {
	
	private static ArrayList<String> myList;
	private static String s;
	
	public static void stringIterate(String s) {
		myList = new ArrayList<String>();
		StringTokenizer stringTokenizer = new StringTokenizer(s, ", .");
//		System.out.println("Total number of tokens found : " + stringTokenizer.countTokens());
		while (stringTokenizer.hasMoreTokens()) {
			myList.add(stringTokenizer.nextToken());
		}
	}
	
	public static void main(String[] args) {
		s = "In solving a problem of this sort, the grand thing is to be able to reason backwards. That is a very useful accomplishment, and a very easy one, but people do not practice it much. In the every-day affairs of life it is more useful to reason forwards, and so the other comes to be neglected. There are fifty who can reason synthetically for one who can reason analytically.";
		stringIterate(s);
		System.out.println("Is the list empty: " + myList.isEmpty());
		System.out.println("Number of words in list: " + myList.size() + "\n");
		
		// iterate
		System.out.println("Iteration");
		System.out.println("=================");
		ListIterator<String> itr;
	    itr = myList.listIterator();
	    while(itr.hasNext()){
	        System.out.println(itr.next());
	     }
	    System.out.println("=================\n");
		
		// reverse iterate
	    System.out.println("Reverse Iteration");
	    System.out.println("=================");
	    while(itr.hasPrevious()) {
	    	System.out.println(itr.previous());
	    }
	    System.out.println("=================\n");
	    
	    //natural sorting order
	    System.out.println("Natural Order");
		System.out.println("=================");
	    Collections.sort(myList);
	    itr = myList.listIterator();
	    while(itr.hasNext()){
	        System.out.println(itr.next());
	     }
	    System.out.println("=================\n");
		
		//case insensitive sorting
	    System.out.println("Case Insensitive");
		System.out.println("=================");
	    Collections.sort(myList, String.CASE_INSENSITIVE_ORDER);
	    itr = myList.listIterator();
	    while(itr.hasNext()){
	        System.out.println(itr.next());
	     }
	    System.out.println("=================\n");
		
		//remove tokens, iterate again
		myList.remove(5);
		myList.remove(22);
		myList.remove(49);
		itr = myList.listIterator();
		System.out.println("Iteration After Removing Tokens");
		System.out.println("=================");
	    while(itr.hasNext()){
	        System.out.println(itr.next());
	     }
	    System.out.println("=================\n");
		
		
		//clear collection, check size
		myList.clear();
		System.out.println("Size after clearing list: " + myList.size());
	}

}

