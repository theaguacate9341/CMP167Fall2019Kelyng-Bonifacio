/**
 * @author Kelyng Bonifacio
 * @description This program checks if number is divisible with another number
 **/
import java.util.Scanner;
public class Unit4p2 {
	public static void main(String[] args) {
		int a, b;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("This program checks if a is divisible by b");
			System.out.print("Enter a: "); 
			a = in.nextInt();
			System.out.print("Enter b: ");
			b = in.nextInt();
			
			if (a%b==0) {
				System.out.printf("%d is divisible by %d ", a, b);
			}
			else {
				System.out.printf("%d is not divisible by %d ", a,b);
			}
			
			
	}

}
