import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}
		 
		
		
		public double Division(double num1, double num2) throws RemoteException{
			if(num2 != 0){
				return num1/num2;
			}
			else{
				System.out.println("Cannot Divide A Number By Zero!");
			}	
			return num1/num2;
		}
	
	}
	
 