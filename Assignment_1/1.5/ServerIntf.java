import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	public int powerOfTwo(int n) throws RemoteException;
	 
}
