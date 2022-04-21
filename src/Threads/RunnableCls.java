
package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableCls implements Runnable{

    int valor;

    public RunnableCls(int valor) {
        this.valor = valor;
    }
    @Override
    public void run() {
        for (int i=0;i<=this.valor;i++){
            System.out.println(i);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RunnableCls.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
}
