package cse360assign3;
import java.util.*;
public class calculator extends AddingMachine{
	
	protected int total;
	protected String history ="0"; 
	
	public void mult (int value) {
		total = total * value;
		history += " * " + value;
	}
	
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
	
	public void power (int value) {
		if(value < 0)
		{
			total = 0;
		}
		double pow = value;
		double totPow = total;
		total = (int) Math.pow(totPow, pow);
		history += " ^ " + value;
	}
	
	public String toString()
	{
		return super.toString() + history;
	}
	
	public void clear() {
		total = 0;
		history = "0";
	}

}
