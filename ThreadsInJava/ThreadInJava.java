// Thread with the help of thread method you run multiple task at the same time.
// If you want those class make threads just extends the threads, after this class in not ordinary class.
// You can control your task with the help of schedular.

package ThreadsInJava;

class A extends Thread {
    public void run() { // In every thread you have run method to call, You want to call your method (run) not a normal name.

        for (int i = 0; i < 100; i++) {
            System.out.println("hii");

            // With the help of Thread.sleep method you give your task take a break after.
            // executing. it's always writen in try catch block.
            // Wtih the help of you perform your task individualy and say parallel.
            // But in some condition you also see the repetative task so it's noraml in threads.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadInJava {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // We have concept of threads priority its range 1-10 1 is lowset and 10 is highest and the default is 5.
        // System.out.println(obj1.getPriority()); // How you see your priority with the help of (getPriority).

        // With the help of you justify with method have highest and lowest and normal prioritiy.
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(Thread.MIN_PRIORITY);
        // obj1.setPriority(Thread.NORM_PRIORITY);

        // You can also fix your prioritiy with the help (setPriority). How much Priority give it to your task.
        // System.out.println(obj1.setPriority(2));

        // Here's you call your method with the help of Start Method. start method belongs to the thread class, Otherwise it's not executing the method you pass in class.
        // For optimizing you also give to break your method.
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}  