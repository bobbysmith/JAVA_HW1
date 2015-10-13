package bobby.collections;
import java.util.ArrayList;

public class MyCollection {
	
	private static ArrayList<String> myList = new ArrayList<String>();
	
	public static void main(String[] args) {
		myList.add("In solving a problem of this sort, the grand thing is to be able to reason backwards. That is a very useful accomplishment, and a very easy one, but people do not practice it much. In the every-day affairs of life it is more useful to reason forwards, and so the other comes to be neglected. There are fifty who can reason synthetically for one who can reason analytically.");
		
		System.out.println(myList);
	}

}
