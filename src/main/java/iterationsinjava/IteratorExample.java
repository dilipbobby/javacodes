package iterationsinjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

	   public static void main(String args[]) {
	      // Create an array list
	      ArrayList TechHill = new ArrayList();
	      // add elements to the array list
	      TechHill.add("Cat");
	      TechHill.add("Arc");
	      TechHill.add("Eat");
	      TechHill.add("Bat");
	      TechHill.add("Due");
	      TechHill.add("Fill");

	      // Use iterator to display contents of TechHill
	      System.out.print("OriginTechHill contents of TechHill: ");
	      Iterator itr = TechHill.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
		  // Modify objects being iterated
	      ListIterator litr = TechHill.listIterator();
	      while(litr.hasNext()) {
	         Object element = litr.next();
	         litr.set(element + "+");
	      }
	      System.out.print("Modified contents of TechHill: ");
	      itr = TechHill.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();

	      // Now, display the list backwards
	      System.out.print("Modified list backwards: ");
	      while(litr.hasPrevious()) {
	         Object element = litr.previous();
	         System.out.print(element + " ");
	       }
	       System.out.println();
	    }
}