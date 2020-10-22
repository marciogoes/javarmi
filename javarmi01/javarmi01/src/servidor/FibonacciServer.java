package servidor;

import java.rmi.RemoteException;
import java.rmi.*;
import java.net.*;

public class FibonacciServer {
    
    public static void main(String[] args) {
        try {
            
            FibonacciImpl f = new FibonacciImpl(); // instância do objeto remoto
            Naming.bind("fibonacci", f); // Registo do objeto remoto
            System.out.println("Servidor Fibonacci pronto");
            
        }
        catch (Exception e) {
            System.out.println("Servidor não inicializou");
        }
        
    }
    
}
