import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	public double milesToKilometers(double miles) throws RemoteException;
}
