/**
 * 
 * @author Kelyng Bonifacio
 * description: Example of showing how scanner imput works
 * created:September 04 2019
 *
 */
//import Scanner class
import java.util.Scanner;
public class NameGetter {
//main method,
	//the program starts at the main method
	public static void main(String[] args) {
	//Create Scanner Object
	Scanner input = new Scanner(System.in);
	//Prompts the user for an input
	System.out.println("Enter Your first and last name");
	//Waits for the input from the user
	//and grabs it, then store the variable
	String fname = input.next();
	String lname = input.next();
	//Reply to user
	System.out.println("Thank you, "+fname);
	System.out.println("Oh your last name is "+lname+"!!");
} }
