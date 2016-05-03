package lists;

import java.util.Arrays;
import java.util.List;

public class ListToCommaValues {

	  public static void main(String[] args) {

	    //List of numbers we want to concatenate
	    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

	    //The string builder used to construct the string
	    StringBuilder commaSepValueBuilder = new StringBuilder();

	    //Looping through the list
	    for ( int i = 0; i< numbers.size(); i++){
	      //append the value into the builder
	      commaSepValueBuilder.append(numbers.get(i));

	      //if the value is not the last element of the list
	      //then append the comma(,) as well
	      if ( i != numbers.size()-1){
	        commaSepValueBuilder.append(", ");
	      }
	    }
	    System.out.println(commaSepValueBuilder.toString());

	  }

	}