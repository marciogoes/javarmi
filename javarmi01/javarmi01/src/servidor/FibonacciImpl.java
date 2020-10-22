package servidor;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.math.BigInteger;

public class FibonacciImpl implements Fibonacci {
    
    public FibonacciImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this);
    }

    @Override
    public BigInteger getFibonacci(int n) throws RemoteException {
         return(null);
    }

    @Override
    public BigInteger getFibonacci(BigInteger n) throws RemoteException {
        return(null);
    }   
    
}
