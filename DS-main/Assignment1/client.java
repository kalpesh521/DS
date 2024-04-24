import java.rmi.*;
import java.util.*;


public class client {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
    try {
    // Get reference to the remote object
    String serverURL="rmi://localhost/server";
    ServerIntf serverInft =(ServerIntf) Naming.lookup(serverURL);
    System.out.println("Enter first number: "); 
    double d1 = sc.nextDouble();
    System.out.println("Enter second number: " );
    double d2 = sc.nextDouble();
    // Invoke remote method to add numbers
    System.out.println("******************RESULT**************");
    System.out.println("The addition is: " + serverInft.addition(d1, d2));
    System.out.println("The substraction is: " + serverInft.substraction(d1, d2));
    System.out.println("The multiplication is: " + serverInft.multiplication(d1, d2));
    System.out.println("The division is: " + serverInft.division(d1, d2));
    
    
    }
    catch (Exception e) 
    { System.out.println("Exception: "+ e);
    }
}
}
