import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}
		
		 
		
		
		public int powerOfTwo(int n) throws RemoteException {
			return (int) Math.pow(2, n);
		}
	
	}
	
 