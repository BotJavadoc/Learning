package collectionlearn;

import java.util.concurrent.atomic.AtomicInteger;

public class LearnAtomic {
    public static void main(String args[]) throws InterruptedException {
        AtomicInteger counter =  new AtomicInteger(0);
        LearnAtomic learnAtomic = new LearnAtomic();
        System.out.println(learnAtomic.increment(counter));
        Thread oneThread = new Thread( ()-> {
            for (int i = 0; i < 10; i++) {
               System.out.println("thread one "+learnAtomic.oneThread(counter));
            }
            
        });
        Thread twoThread = new Thread( ()-> {
            for (int i = 0; i < 10; i++) {
               System.out.println("thread two "+learnAtomic.twoThread(counter));
            }
            
        });
        oneThread.start();
        twoThread.start();
        oneThread.join();
        twoThread.join();
    }
    public AtomicInteger increment(AtomicInteger counter) {  
            counter.incrementAndGet();
            return counter;
        }
        public AtomicInteger oneThread(AtomicInteger counter) {
                 counter.incrementAndGet();   
                 return counter;


        }
         public AtomicInteger twoThread(AtomicInteger counter) {
                 counter.incrementAndGet();   
                 return counter;
        }
}