/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Server.SampleServer;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author admin
 */
public class SampleClient {
    public static void main(String args[])
    {
        try
        {
            System.out.println("security manager loaded");
            String  url="//localhost/SampleServer";
            SampleServer remoteobject=(SampleServer)Naming.lookup(url);
            System.out.println("got remote object");
            System.out.println("1+2="+remoteobject.sum(1, 2));
            
            
        }
        catch(RemoteException exc)
        {
            System.out.println("error in lookup"+exc.toString());
            
        }
        catch(java.net.MalformedURLException exc)
        {
            System.out.println("malformed url"+exc.toString());
        }
        catch(java.rmi.NotBoundException exc)
        {
            System.out.println("not bound"+exc.toString());
        }
    }
    
}
