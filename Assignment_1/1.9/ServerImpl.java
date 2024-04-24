import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}
		
	 
		
		public String findLexicographicallyLargest(String str1, String str2) throws RemoteException {
 			if (str1.compareTo(str2) > 0) {
				return str1;
			} else {
				return str2;
			}
		}
		 
	
	}
	
 