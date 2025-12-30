package ThreadsInJava;

// Here we use runnable to is a implements with the help of interface called runnable.
//In runnable method we dont have so you need to mention about the thread in main class.

class A implements Runnable {
    public void run() { // In every thread you have run method to call, You want to call your method (run) not a normal name.

        for (int i = 0; i < 5; i++) {
            System.out.println("hii");

            // With the help of Thread.sleep method you give your task take a break after
            // executing. it's always writen in try catch block.
            // Wtih the help of you perform your task individualy and say parallel.
            // But in some condition you also see the repetative task so it's noraml in
            // threads.
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }
}

public class RunnableInJava {
    public static void main(String[] args) {

        Runnable obj1 = new A(); // This runnable is constructor of the object and this runnable is method which we calling in this method. Because obj1 is also runnable object.
        Runnable obj2 = new B();

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

        // For runnable you need to create to diffrent thread for bothh class A and B.
        // This thread has a multiple constructor in all those constructor we called (Runnable).
        Thread t1 = new Thread(obj1); // And in this constructor we pass the object.
        Thread t2 = new Thread(obj2);
        
        t1.start(); // Here's the start belongs to the thread class. we call with the help of (t1.).
        t2.start();
        
    }
}  