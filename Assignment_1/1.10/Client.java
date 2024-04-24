import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
 		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
			
			Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            int result = serverIntf.countVowels(word);

			System.out.println("--------------- Results ---------------");
            System.out.println("Number of vowels in the word: " + result);
			
 			 
			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
