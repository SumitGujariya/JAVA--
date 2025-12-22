// package ObjectOrientedProgramming.OopsConcept;


// This is the example of copy constructor.
// The copy constructor work is inherit the properties of (s1), You understand by the given example.


class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        }
        
        Student(Student s2) {
            this.name = s2.name;
            this.age = s2.age;
            }
            
            Student() {
                
            }
            

}


public class CC {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sumit";
        s1.age = 21;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

