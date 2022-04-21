package Threads;

public class ThreadsMain {

    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

        ThreadsCls hilo0 = new ThreadsCls(10);
        ThreadsCls hilo1 = new ThreadsCls(8);

//          RunnableCls obj1 = new RunnableCls(10);
//          Thread hilo0 = new Thread(obj1);
//          
//          RunnableCls obj2 = new RunnableCls(8);
//          Thread hilo1 = new Thread(obj2);
        
        hilo0.start();
        hilo1.start();

    }

}
