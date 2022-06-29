/**Median.java - Joshua Cline-Cole - March 16th, 2017
 * To practice using arrays
 */
import java.util.Scanner;
public class Median2 {

	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("How many numbers are in your array? --> ");
		int length = inputDevice.nextInt(); // Allows for user to pick their number w/o causing computer to freak out
		double [] array = new double [length+1];
		double input;
	

		for (int i=0; i<length; i++)
		{
			System.out.print("Input a series of " +length+ " numbers -->");
			input=inputDevice.nextDouble();
			array[i]=input; // Hooray for syntax errors (it took me a few minutes to realize that I had to flip this
		}
		double even = array[length/2] + (array[length+1/2]); /* In a test I did, I set my length equal to 8 and my 
		numbers to be 1-8. It sort of works, but the code chooses to round up to 5 instead of using the value 
		4.5. I tried changing length to be double, but it causes the program to have errors? Do you know of any way
		to fix this? */

		/*Future me here (2022) this doesn't work cause it'd have to be a float, not a double. */
		if (length == 2 || length==4 || length == 6 || length == 8)
		System.out.println("The median is " +even);
		else
			System.out.println("The median is " +array[length/2]);

	}

}
