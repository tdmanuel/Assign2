/**
 * Name: Thera Manuel
 * Class ID: 85141
 * Assignment #3
 * 
 * Description: Adds, subtracts, and returns the total. Provides history of addition and 
 * subtraction of the total and clears them
 * 
 * @param A total to be added to or subtracted from
 * @return The resulting total and history of transactions
 */

package cse360assign3;
public class AddingMachine {

	protected int total;
	protected String history = "0"; 
	
	//Constructor to define the variable total
	public AddingMachine () {
		total = 0;
	}
	
	//Returns the resulting total
	public int getTotal () {
		return total;
	}
	
	//Adds a given value to the total and adds the transaction to the history.
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	
	//Subtracts a given value from the total and adds the transaction to the history.
	public void subtract (int value) {
		total = total - value;
		history += " - " + value; 
	}
	
	//Returns a string showing the history of transactions.
	public String toString () {
		
		return history;
	}

	//Clears the total and history back to 0
	public void clear() {
		total = 0;
		history = "0";
	
	}
}
