import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.print("Enter String: ");
			String  str= sc.nextLine();
			
			 
			
			
			System.out.println("String is " + str);
 			
			
			System.out.println("--------------- Results ---------------");
 			System.out.println("Server response: " +  serverIntf.sayHello(str));

			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
