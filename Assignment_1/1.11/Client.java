import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
 		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

             long result = serverIntf.factorial(number);

            System.out.println("Factorial of " + number + " is: " + result);
			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
