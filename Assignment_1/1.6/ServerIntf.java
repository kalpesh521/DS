import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	public double celsiusToFahrenheit(double celsius) throws RemoteException;
}
