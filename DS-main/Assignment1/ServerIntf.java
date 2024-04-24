import java.rmi.*;
interface ServerIntf extends Remote{

    public double addition(double num1,double num2) throws RemoteException;
    public double substraction(double num1,double num2) throws RemoteException;
    public double multiplication(double num1,double num2) throws RemoteException;
    public double division(double num1,double num2) throws RemoteException;
     
}
