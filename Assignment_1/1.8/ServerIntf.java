import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	public String sayHello(String name) throws RemoteException;
	 
}
