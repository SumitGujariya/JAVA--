package ObjectOrientedProgramming.Bank;


/*
Packages in java
Package is a group of similar types of classes, interfaces and sub-packages. 
Packages can be built-in or user defined. 
Built-in packages - java, util, io etc. 

import java.util.Scanner; 
import java.io.IOException;
*/

/*
Access Modifiers in Java 

➢  Private: The access level of a private modifier is only within the class. It cannot 
be accessed from outside the class. 
➢  Default: The access level of a default modifier is only within the package. It 
cannot be accessed from outside the package. If you do not specify any access 
level, it will be the default. 
➢  Protected: The access level of a protected modifier is within the package and 
outside the package through child class. If you do not make the child class, it 
cannot be accessed from outside the package. 
➢  Public: The access level of a public modifier is everywhere. It can be accessed 
from within the class, outside the class, within the package and outside the 
package.
*/


class Account {
    public String name; // This is public any one can access.
    protected String email; // This is protectes it's only access whenever the package import.it's only access by the by another files of their sub class.
    private String password; // This is private no one can access untill for access this you need to define fuction with the help of getters and setters.
    // Default :- we have default type also it set the value by default.

    // Getters and Setters help you to acces the password.
    public String getPassword() { // Here's you get the password.
        return this.password; // It's help you return the password.
    }

    // public String getPassword() {
    //     setPassword(randomPass);
    //     return this.password;
    // }

    // You make private your setPassword also, after that no one can access the password (Ex in line num (14)). 
    public void setPassword(String pass) { // Here's you set your password.
        this.password = pass; // Here's you access the password with the help of set parameters.
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "sumit";
        account1.email = "demo99@gmail.com";
        account1.setPassword("abcd"); // Here's you set the password.
        
        System.out.println(account1.getPassword()); // How you call the function.
    }
}