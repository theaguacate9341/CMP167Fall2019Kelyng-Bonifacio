/**
 * 
 * @author Kelyng Bonifacio
 *
**/
import java.util.Random; //Tool for random intergers from java
public class RanGenTest {
	public static void main(String[] args) {
		Random randGen;
			int num;
			int num2;
		
		randGen = new Random();
		 num = randGen.nextInt(15)+1; //Generates a random value from 1-15 
		
		num2 = 14;
		
		if (num==num2)
		 System.out.println("its a match");
		else 
			System.out.println("its is not a match");
		
		
		System.out.println("The number of today is...");
		System.out.println(num);
	}

}
