package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsCls extends Thread {

    int valor;

    public ThreadsCls(int valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        for (int i = 0; i <= valor; i++) {
            System.out.println(this.getName() + "->" + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadsCls.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
