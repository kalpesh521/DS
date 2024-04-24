import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.print("Enter Distance in miles: ");
			double miles = sc.nextDouble();
			
			 
			
			
			System.out.println("Distance in miles " + miles);
			 
			
			
			System.out.println("--------------- Results ---------------");
 			System.out.println(miles + " miles is equal to " +  serverIntf.milesToKilometers(miles) + " kilometers");

			 
			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
