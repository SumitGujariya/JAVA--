// Anotation(@override) function(method).

class A {
    public void showTheDataWhichBeLongsToThe() {
        System.out.println("In a show");
    }

}

class B extends A {

    @Override // after write the override anotation method you find the error without wasting time in compile. it will show you the error.
    public void showTheDataWhichBeLongsToThe() {
        System.out.println("In b show");
    }
}

public class Anotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBeLongsToThe();

    }
}