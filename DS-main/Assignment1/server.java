import java.rmi.*;

public class server {
public static void main(String args[]) {
  try {
  //create remote object
  ServerImpl addServerImpl = new ServerImpl(); 
  System.out.println("Server Started");
  //bind the remote object
  Naming.rebind("server", addServerImpl);
  }
  catch (Exception e) {
  System.out.println("Exception: "+ e);
  }
}
}
