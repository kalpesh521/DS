import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}
		
		public long factorial(int n) throws RemoteException {
			if (n == 0 || n == 1) {
				return 1;
			} else {
				return n * factorial(n - 1);
			}
		}
		
		
		 
	
	}
	
 