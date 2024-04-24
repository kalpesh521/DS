import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	long factorial(int n) throws RemoteException;
}
