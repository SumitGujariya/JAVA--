/*
Final keyword we use this final keyword in three places 
Final:- variables, class, method.
If you define the final keyword into the front of variables, it means you can not change the value of this variables.
If you define the final keyword in the front of class then no one can extends and say (Inherit) the propereties of your class.
If you defien the final keyword inside you method which is write you inside the class then no one can overriding you method with the help of this final keyword.
*/

class Calc {

    public void show() {
        System.out.println("this is show time");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

// Now it's overridden the value.
class AdvCalcu extends Calc {

    public void show() {
        System.out.println("John doe");
    }

}

public class Finall {
    public static void main(String[] args) {

        // Once you define the final keyword you can not change the value of the
        // variables.
        // If you try it's throw you error.it's related to static keyword.
        // final int num = 4;
        // num = 5;
        // System.out.println(num);

        // Calculator obj = new Calculator();
        
        AdvCalcu obj = new AdvCalcu();
        obj.show();
        obj.add(4, 6);

    }
}
