/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;

/**
 *
 * @author admin
 */
public interface SampleServer extends Remote {
    public int sum(int a, int b) throws RemoteException ;
    
           
}
