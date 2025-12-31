package ThreadsInJava;

// Here we use two thread with a same variables you make as synchronized.
// In that we use synchronized keyword.

class Counter {
    int count;
    public synchronized void increment() { // Here we use the synchronized keyword.
        count++;
    }
}



public class RaiseThread { 
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // Here's the start belongs to the thread class. we call with the help of (t1.).
        t2.start();
  
        // Join is a special method which allows you to your main threas to wait for two other thread to comeback and join.
        // It throws a decleration called (throws InterruptedException).
        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}