package collectionlearn;

class Counter {
    int counter =0;
    void incr() {
        synchronized (this) {
         counter++;
        }
       
    }
}

public class LearnSyncronized {
    public static void  main(String [] args) {
        try {
            Counter c = new Counter();
            Thread t1 = new Thread(()-> {
                for (int i = 0; i < 10; i++) {
                    c.incr();
                    System.err.println("counter value 1 "+c.counter);
                }
            });
            Thread t2 = new Thread(()-> {
                for (int i = 0; i < 10; i++) {
                    c.incr();
                    System.err.println("counter value 2 "+c.counter);
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.getLogger(LearnSyncronized.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
