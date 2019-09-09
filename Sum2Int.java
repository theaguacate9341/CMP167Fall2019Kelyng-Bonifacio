/**
 * 
 * @author Kelyng Bonifacio
 *
 */
import java.util.Scanner;
public class Sum2Int {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two int values");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int result = num1+num2;
		
		System.out.print(result);
		
	}

}
