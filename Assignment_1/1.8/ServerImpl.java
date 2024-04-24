import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf {
	
		public ServerImpl() throws RemoteException{
		
		}
		
		public String sayHello(String name) throws RemoteException {
			return "Hello, " + name;
		}
		
		
		 
	
	}
	
 