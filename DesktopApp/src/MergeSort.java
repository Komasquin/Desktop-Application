import java.util.ArrayList;

public class MergeSort {
	 public static void merge(ArrayList<Integer> array, int s, int m, int e){
		 	//find the middle of the 'list
	    	int size1 = m - s + 1;
	    	//find the middle of the 'list'
	    	int size2 = e - m;
	    	//'list' of the left side of the 'list' param
	    	ArrayList<Integer> left = new ArrayList<Integer>();
	    	//'list' of the right side of the 'list' param
	    	ArrayList<Integer> right = new ArrayList<Integer>();
	    	//'for loop' to fill the left side 'list'
	    	for(int i = 0; i < size1; i++) {
				left.add(array.get(s + i));
	    	}//end of 'for loop'
	    	//'for loop' to fill the left side 'list'
	    	for(int j = 0; j < size2; j++){
	    		right.add(array.get(m + 1 + j));
	    	}//end of 'for loop'
	    	//variables to keep track of the 'left and right' lists inputs
	    	int i = 0, j = 0;
	    	//set general counter for 'list' to the 'start' of param 'list'
	    	int k = s;
	    	//condition to make sure the 'lists' are filled to the size
	    	while(i < size1 && j < size2){
	    		//if 'left' less than 'right' store left in the new 'list'
	    		//else 'right' less than 'left' store right in the new 'list'
	    		//increment
	    		if(left.get(i) <= right.get(j)){
	    			array.set(k, left.get(i));
	    			i++;
	    		}else{
	    			array.set(k, right.get(j));	
	    			j++;
	    		}//end of 'if statement'
	    		//Increment the size of new param 'list' 
	    		k++;
	    	}//end of 'while loop'
	    	//conditions if there are still elements in the 'left or right' to finish using them
	    	while(i < size1){
	    		array.set(k, left.get(i));
	    		i++;
	    		k++;
	    	}//end of 'while loop'
	    	while(j < size2){
	    		array.set(k, right.get(j));
	    		j++;
	    		k++;
	    	}//end of 'while loop'
	    }//end of 'merge' method

	    public static void sort(ArrayList<Integer> array, int s, int e){
	    	if(s < e){
	    	//finding the middle of 'array'
	   		int m = (s + e) / 2;
	   		//rec call to 'sort()' method first half of 'array'
	   		sort(array, s, m);
	   		//rec call to 'sort()' method second half of 'array'
	   		sort(array, m + 1, e);
	   		//call to merge after 'array' is broken down recursively 
	   		merge(array, s, m, e);
/**
	   		//TEST: print the values
	   			for(int i = 0; i < m; i++){
	   			System.out.print(array.get(i) + " ");
	   			}
	   			System.out.print("\n");
	   			for(int j = m ; j < e; j++){
	   			System.out.print(array.get(j)+ " ");
	   			}
	   			System.out.print("\n");
**/
	   		}//end of 'if statement'
	    }//end of 'sort' method
}
