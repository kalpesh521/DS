import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	String findLexicographicallyLargest(String str1, String str2) throws RemoteException;

}
