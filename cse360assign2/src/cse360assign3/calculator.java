/**
 * Name: Thera Manuel
 * Class ID: 85141
 * Assignment #3
 * 
 * Description: This class inherits the AddMachine class. Additional methods are included to perform multiplication, 
 * division, and power. Uses the AddMachine class for the total and history as well as the clear method.
 * 
 * @param A total to multiply, divide, or add power to
 * @return The resulting total and history of transactions
 */

package cse360assign3;
public class calculator extends AddingMachine{
	
	//Constructor to define the total variable in this class with AddingMachine's total variable
	public calculator()
	{
		total = super.getTotal();
	}
	
	//Multiplies a given value to the total and adds the transaction to the history.
	public void mult (int value) {
		total = total * value;
		history += " * " + value;
	}
	
	//Divides a given value to the total and adds the transaction to the history.
	public void div (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		history += " / " + value;
	}
	
	//Multiplies the total to the power of the value and adds the transaction to the history.
	public void power (int value) {
		if(value < 0)
		{
			total = 0;
		}
		else
		{
			double pow = value;
			double totPow = total;
			total = (int) Math.pow(totPow, pow);
		}
		history += " ^ " + value;
	}
	
	

}
