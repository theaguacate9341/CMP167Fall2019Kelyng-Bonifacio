/**
 * @author Kelyng Bonifacio
 */
import java.util.Scanner;
public class Loop1 {
	public static void main(String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		// Sum of two numbers
		System.out.print("Input 2 values: ");
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		int result = (num1 + num2);
		System.out.println(result);
		
		//Print all squares
		System.out.print("Input a number for the variable n: ");
		int n = scnr.nextInt();
		int SN;
		for (int i = 1; i < n + 1; i++) {
			SN = i * i;
			System.out.printf("The square of %d is %d\n",i,SN);
		}
		for(int i = 1; i < 101; i++) {
			while (i % 2 != 0) {
				continue;
			}
	
		}
		
		
		
	}

}
