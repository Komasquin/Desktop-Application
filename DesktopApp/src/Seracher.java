import java.util.*;

public class Seracher {
	public static boolean search(ArrayList<Integer> arr, int val) {
		//iterate the whole 'list'
		for(int i= 0; i < arr.size() ; i++) {
			//if the value searched for equals a vlue in the 'list' return true
			if(arr.get(i).equals(val)) {
				return true;
			}//end of 'if statement'
		}//end of 'for loop'
		//after iterating the 'list' return false
		return false;
	}//end of 'search' method
}
