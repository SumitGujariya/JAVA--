// This is the example of UpCasting and DownCasting.

class A {
    public void show1() {
        System.out.println("In A");
    }

}

class B extends A {
    public void show2() {
        System.out.println("In B");
    }
}

public class UpAndDownCasting {
    public static void main(String[] args) {

        A obj = new B(); // This is UpCasting.
        obj.show1();

        B obj1 = (B) obj; // This is DownCasting.
        obj1.show2();

    }
}