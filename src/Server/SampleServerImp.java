/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import static java.lang.Double.sum;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.*;


/**
 *
 * @author admin
 */
public class SampleServerImp extends UnicastRemoteObject implements SampleServer {
    SampleServerImp()throws RemoteException
    {
        super();
    }
    public int sum(int a,int b)throws RemoteException
    {
        return a+b;
    }
    public static void main(String args[])
    {
        try
        {
            SampleServerImp Server= new SampleServerImp();
            Naming.rebind("SampleServer", Server);
            System.out.println("server waiting");
        }
        catch(java.net.MalformedURLException me)
        {
            System.out.println("malformes url:"+me.toString());
        }
        catch(RemoteException re)
        {
            System.out.println("remoe exception"+ re.toString());
            
        }
        
    }
}
