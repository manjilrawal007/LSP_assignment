package org.howard.edu.lsp.assignment4;



/**
 * Manjil
 * @author Manjil Rawal
 *
 */
 
/**
 * {@summary class to run and test the program}
 * @author Manjil Rawal
 */
public class Driver {
	/**
	 * {@summary main method to test the implementation of the IntegerSet}
	 * @param args String[]
	 */
	public static void main(String[] args) {
//		implementation of the IntegerSet
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		System.out.println("Values of Set1 is:" + set1.toString());
		System.out.println("For the largest and smallest value in set1 ");
		try {
			System.out.println("Smallest value in Set1 is: " + set1.smallest());
			System.out.println("Largest value in Set1 is: " + set1.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Unable to find the smallest or largest value: there are no elements in the set");
		}
		
		System.out.println();
		
		System.out.println("To check if the set is empty or not");
		System.out.println("The value of set1 is: " + set1.toString());
		System.out.println("The result is: " + set1.isEmpty());
		System.out.println();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);

		System.out.println("For Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2: " + set1.toString());
		System.out.println();
		
		System.out.println("For the intersection of the sets");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Result after the intersection is: " + set1.toString());
		System.out.println();
		
		System.out.println("To check whether the set1 is equal to set 2");
		System.out.println("The value of set1 is : " + set1.toString());
		System.out.println("The value of set2 is : " + set2.toString());
		System.out.println("The result is : " + set1.equals(set2));
		System.out.println();
		
		System.out.println("To remove the value of 5 from set 2");
		System.out.println("Value of Set2 is: " + set2.toString());
		set2.remove(5);
		System.out.println("Value of set2 after the removal is: " + set2.toString());
		System.out.println();
		
		System.out.println("For the difference of the sets Set1 - set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.diff(set2);
		
		System.out.println("The result is: " + set1.toString());
		System.out.println();
		
		System.out.println("For error handling demonstration: ");
		set1.remove(5);
		System.out.println("The value of the set1 is: " + set1.toString());
		System.out.println("Largest and smallest value in the set1 is");
		
		
		
		try {
			System.out.println("Smallest value in Set1 is:" + set1.smallest());
			System.out.println("Largest value in Set1 is:" + set1.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Unable to find the smallest or largest value: there are no elements in the set");
		}
		
		System.out.println();
		System.out.println("To check the length of the sets");
		System.out.println("The value of set1 is: " + set1.toString());
		System.out.println("The length of set1 is: " + set1.length());
		System.out.println();
		
		set2.add(4);
		set2.add(1);
		
		System.out.println("To check for the clear method");
		System.out.println("Current value of set2 is: " + set2.toString());
		set2.clear();
		System.out.println("The value of set2 after clearing is: " + set2.toString());
		System.out.println();
		
		System.out.println("To check the add method ");
		System.out.println("The current value of set2 is: " + set2.toString());
		set2.add(1);
		set2.add(2);
		System.out.println("After adding the value 1 and 2, the value of set2 is: " + set2.toString());
		System.out.println();
		
		System.out.println("To check remove method");
		System.out.println("The current value of set2 is: " + set2.toString());
		set2.remove(2);
		System.out.println("After removing the value 2, from the set2, the value becomes: " + set2.toString());
		
		
		
		System.out.println("__________________________________________");
		System.out.println();
		
		set1 = new IntegerSet();
		set1.add(1);
		set1.add(5);
		set1.add(7);
		
		set2 = new IntegerSet();
		set2.add(1);
		set2.add(5);
		
		System.out.println("To find out the largest and smallest value in set1");
		System.out.println("Value of Set 1 is : " + set1.toString());
		try {
			System.out.println("Smallest value in Set 1 is: " + set1.smallest());
			System.out.println("Largest value in Set 1 is: "+ set1.largest());
		}
		catch (IntegerSet.IntegerSetException e) {
			System.out.println("Unable to find the smallest and largest value: the set 1 is empty");
		}
		System.out.println();
		
		System.out.println("For the union of Set1 and Set2");
		System.out.println("Value of Set1 is : " + set1.toString());
		System.out.println("Value of Set2 is : " + set2.toString());
		set1.union(set2);
		System.out.println("Value of the union is: " + set1);
		System.out.println();
		
		System.out.println("To remove the value 1 from set 2");
		System.out.println("The value of set2 is " + set2.toString());
		set2.remove(1);
		System.out.println("the value for the set2 after removal is: " + set2.toString());
		System.out.println();
		
		
		System.out.println("For the intersection of the sets");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Result after the intersection is: " + set1.toString());
		System.out.println();
		
		System.out.println("For the removal of the value 5 from set 2");
		System.out.println("Current value of set2 is " + set2.toString());
		set2.remove(5);
		System.out.println("Value of set2 after the removal is " + set2);
		System.out.println();
		
		System.out.println("For The difference of set1 - set2");
		System.out.println("Current value of the set 1: " + set1.toString());
		System.out.println("Current value of the set2: " + set2.toString());
		set1.diff(set2);
		System.out.println("Value of the difference is: " + set1.toString());
		System.out.println();
		
		System.out.println("For the error handling of the empty set2");
		System.out.println("The value for the set2 is : " + set2.toString());
		System.out.println("To find the largest and the smallest of set2 ");
		try {
			System.out.println("Smallest value in Set2 is:" + set2.smallest());
			System.out.println("Largest value in Set2 is:" + set2.largest());
		} catch (IntegerSet.IntegerSetException e) {
			System.out.println("Unable to find the smallest or largest value: there are no elements in the set");
		}
		System.out.println();
		
		System.out.println("The equality check of the sets : ");
		System.out.println("Values of set1 " + set1.toString());
		System.out.println("values of set2 " + set2.toString());
		System.out.println("the equality of set1 and set2 is " + set1.equals(set2));
		System.out.println();
		
		System.out.println("For the check of the length of set1");
		System.out.println("The values in the set1 is: " + set1.toString());
		System.out.println("length of set 1 is " + set1.length());
		
		System.out.println();
		
		System.out.println("Check whether set2 is empty or not");
		System.out.println("The value of set2 is " + set2.toString());
		System.out.println("The result is " + set2.isEmpty());
		System.out.println();
		
		System.out.println("To check the clear method: ");
		System.out.println("The value of set1 is: " + set1.toString());
		set1.clear();
		System.out.println("when the set1 is cleared, the value of set1 is: " + set1.toString());
		System.out.println();
		
		System.out.println("To check the length and add method ");
		System.out.println("The current value of set2 is: "+ set2.toString());
		System.out.println("When values 1 and 3 are added to set2");
		set2.add(1);
		set2.add(3);
		System.out.println("The value of the set2 is : " + set2.toString());
		System.out.println("The length of the set2 is: " + set2.length());
		
		System.out.println();
		System.out.println("To check remove method: ");
		System.out.println("The current value of set2 is: " + set2.toString());
		set2.remove(1);
		System.out.println("After removing the value 1, the value of set2 is: " + set2.toString());
	}
}