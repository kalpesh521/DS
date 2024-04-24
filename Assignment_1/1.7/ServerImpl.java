import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}
		
		public double milesToKilometers(double miles) throws RemoteException {
			return miles * 1.60934; // 1 mile = 1.60934 kilometers
		}
		
		 
	
	}
	
 