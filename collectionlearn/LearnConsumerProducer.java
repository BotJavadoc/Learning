package collectionlearn;

import java.util.ArrayList;
import java.util.List;

class Restaurant {

    private boolean foodReady = false;

    public synchronized void orderFood() throws InterruptedException {

        System.out.println("Customer: I placed the order.");

        while (!foodReady) {
            System.out.println("Customer: Waiting for food...");
            wait();  
        }

        System.out.println("Customer: Eating the food!");
        foodReady = false; 
    }

    public synchronized void prepareFood() throws InterruptedException {

        System.out.println("Chef: Preparing food...");
        Thread.sleep(2000);   

        foodReady = true;
        System.out.println("Chef: Food is ready!");

        notify();  
    }
}

class TryConsumer {

    private final List<Integer> list = new ArrayList<>();
    private final int maxSize = 5;

    public void increaseValue() throws InterruptedException {
    int value = 0;

    for (int i = 0; i < 10; i++) {
        synchronized (this) {

            while (list.size() == maxSize) {
                wait();
            }

            list.add(value);
            System.out.println("Producing: " + value);
            value++;

            notifyAll();
        }
    }
    }

    public void decreaseValue() throws InterruptedException {

    for (int i = 0; i < 10; i++) {
        synchronized (this) {

            while (list.isEmpty()) {
                wait();
            }

            int removed = list.remove(list.size() - 1);
            System.out.println("Consuming: " + removed);

            notifyAll();
        }
    }
}
}




public class LearnConsumerProducer {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Thread customer = new Thread(() -> {
            try {
                restaurant.orderFood();
            } catch (InterruptedException e) {}
        });

        Thread chef = new Thread(() -> {
            try {
                restaurant.prepareFood();
            } catch (InterruptedException e) {}
        });

        // customer.start();
        // chef.start();

        TryConsumer tryConsumer = new TryConsumer();

        Thread produce = new Thread(() -> {
            try {
                tryConsumer.increaseValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
          Thread consume = new Thread(() -> {
            try {
                tryConsumer.decreaseValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    );
    produce.start();
    consume.start();
        
    }

}
