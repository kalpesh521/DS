import java.rmi.*;


interface ServerIntf extends Remote{
 	
 	int countVowels(String word) throws RemoteException;
}
