import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the first string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter the second string: ");
            String str2 = sc.nextLine();
			
			
			System.out.println("First  String Is: " + str1);
			System.out.println("Second  String Is: " + str2);
			
			
			System.out.println("--------------- Results ---------------");
			System.out.println("Result Is: " +serverIntf.findLexicographicallyLargest(str1, str2));
			 
			

		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
