package ObjectOrientedProgramming.TypesOfInterfaces;
// In lambda function you dont need to write everything you like write in normal interface.
// You just need to put the => funtion to write the lambda then the compiler doing all the things for you.
// In you multiple steps then use curly braces otherwise you dont need to use {this} you write directly.

// @FunctionalInterface // It's optional to use everytime.
// interface A {
//     void show();
// }

// public class LambdaInterface {
//     public static void main(String[] args) {
//         A obj = () -> System.out.println("in show");

//         obj.show();
//     }

// }


// @FunctionalInterface // It's optional to use everytime.
interface X {
    // void show(int i); // Example of single variables.
    void show1(int i, int j); // Example of more than two variables.
}

public class LambdaInterface {
    public static void main(String[] args) {


        // with the help of lambda funtion.
        // If you have only one variables you can define single but in some condition if you more than one variables you use the bracets(int i, int j).
        // for single variables.
        // X obj = i -> System.out.println("in show " + i);
        // obj.show(99);
        
        // for multiple variables
        X obj1 = (i, j) -> System.out.println("in show " + i + " : " + j);
        obj1.show1(99, 1);





        // without lambda funtion.
        // X obj = new X() {
        //     public void show(int i) {
        //         System.out.println("In show " + i );
        //     }
        // };
        // obj.show(99);
    }
}
