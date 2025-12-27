// This is the concept of inner class and Anonymous class you just write the class inside the existing class.


class A {

    public void show(){
        System.out.println("In a show");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("In new show");
            }
        };
            obj.show();
    }
}
