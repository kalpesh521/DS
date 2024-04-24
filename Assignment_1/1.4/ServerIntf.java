import java.rmi.*;


interface ServerIntf extends Remote{
	// Syntax for method declaration: access_specifier return_type method_name(arguments...){ return value}
	
 	public double Division(double num1, double num2) throws RemoteException;
}
