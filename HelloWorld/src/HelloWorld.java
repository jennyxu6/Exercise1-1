import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		scan = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String userName = scan.next(); 
		HelloUser newUser = new HelloUser(userName);
		newUser.greetUser();
	}

}
