/*
Encapsulation is the process of combining data and functions into a single unit called class. 
In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. 
In simpler words, attributes of the class are kept private and public getter and setter methods are provided to 
manipulate these attributes. Thus, encapsulation makes the concept of data 
hiding possible.(Data hiding: a language feature to restrict access to members of 
an object, reducing the negative effect due to dependencies. e.g. "protected", 
"private" feature in Java).  
*/
class Account {
    public String name; // This is public any one can access.
    protected String email; // This is protectes it's only access whenever the package import.it's only
                            // access by the by another files of their sub class.
    private String password; // This is private no one can access untill for access this you need to define
                             // fuction with the help of getters and setters.
    // Default :- we have default type also it set the value by default.

    // Getters and Setters help you to acces the password.
    public String getPassword() { // Here's you get the password.
        return this.password; // It's help you return the password.
    }

    // public String getPassword() {
    // setPassword(randomPass);
    // return this.password;
    // }

    // You make private your setPassword also, after that no one can access the
    // password (Ex in line num (14)).
    public void setPassword(String pass) { // Here's you set your password.
        this.password = pass; // Here's you access the password with the help of set parameters.
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "sumit";
        account1.email = "demo99@gmail.com";
        account1.setPassword("abcd"); // Here's you set the password.

        System.out.println(account1.getPassword()); // How you call the function.
    }
}

// For better understanding go to (Bank) folder.