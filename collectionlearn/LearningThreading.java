package collectionlearn;

class CallThread extends Thread {
    public void run () {
        for (int i = 0; i < 10; i++) {
            Thread m = new Thread();
            Thread s = new SecondThread();
            s.start();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                
            }
            System.err.println("Running inside thread");
        }
    }
}
class SecondThread extends  Thread {
    public void run() {
        try {
            System.err.println("I am second thread");
            sleep(1000l);
        } catch (InterruptedException ex) {
            
        }
    }
}


class ApiCallOne extends Thread {
    public void run() {
        System.err.println("Calling the API");
        for (int i = 0; i < 10; i++) {
            try {
                System.err.println("Calling external API "+i);
                sleep(200l);
            } catch (InterruptedException ex) {
                }
        }
    }
}

class ApiCallTwo extends Thread  {
    public void run() {
        System.err.println("Calling internal API");
        for (int i = 0; i < 10; i++) {
            try {
                System.err.println("Calling API internally "+i);
                sleep(300l);
            } catch (InterruptedException ex) {
            }
        }
    }
}
public class LearningThreading {
    public static void main(String[] args) {
        try {
            ApiCallOne apiCallOne = new ApiCallOne();
            ApiCallTwo apiCallTwo = new ApiCallTwo();
            apiCallOne.start();
            apiCallTwo.start();
            apiCallOne.join();
            apiCallTwo.join();
        } catch (InterruptedException ex) {
            System.getLogger(LearningThreading.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
      
    }
}
