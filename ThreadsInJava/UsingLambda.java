// Thread using lambda. With the help of we write optimize code.
// Using anonymous class.

package ThreadsInJava;

public class UsingLambda {
    public static void main(String[] args) {

        // Here we intanciate a interface with the help of anonymous class.
        // Runnables in @Functoinnal interface.thats we use lambda expressions here.
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hii thread first");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello thread second here");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start(); // Here's the start belongs to the thread class. we call with the help of (t1.).
        t2.start();

    }
}