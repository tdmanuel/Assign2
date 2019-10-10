/**
 * Name: Thera Manuel
 * Class ID: 85141
 * Assignment #2
 * 
 * Description: Adds, subtracts, and returns the total. Provides history of addition and subtraction of the total
 * 
 * @param A total to be added to or subtracted from
 * @return The resulting total and history of transactions
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String history ="0"; 
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		history += " - " + value; 
	}
		
	public String toString () {
		
		return history;
	}

	public void clear() {
		total = 0;
		history = "0";
	
	}
}
