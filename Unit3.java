/**
 * @author kelyng bonifacio
 */
import java.io.StringWriter;
import java.io.PrintWriter; 

public class Unit3 {
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.print("Mac Miller");
		//sending the characters to the buffer
		String name = sw.toString();
		//turn sequence of characters into a String
		System.out.println(name);
		
		//%(flag)(width).(precision)specifier
		System.out.printf("His name was %1s", name);
		
	}

}
