import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.print("Enter temperature in Celcius: ");
			double temp = sc.nextDouble();
			
			 
			
			
			System.out.println("Temperature in Celcius " + temp);
 			
			
			System.out.println("--------------- Results ---------------");
 			System.out.println(temp + " Celsius is equal to " + serverIntf.celsiusToFahrenheit(temp) + " Fahrenheit");
			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
