import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.print("Enter Number: ");
			int number= sc.nextInt();
			
			 
			
			
			System.out.println("Number Is: " + number);
 			
			
			System.out.println("--------------- Results ---------------");
 			System.out.println("2's Power of " + number  + " is: " + serverIntf.powerOfTwo(number));
			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
