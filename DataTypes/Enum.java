enum Status {
    Runnig, Failed, Pending, Success;
}

public class Enum {

    public static void main(String[] args) {

        
        Status ss = Status.Success;
        switch (ss) {
            case Runnig:
                System.out.println("all good");
                break;
            case Failed:
                System.out.println("try agian");
                break;
            case Pending:
                System.out.println("plz wait");
                break;
            default:
                System.out.println("You done bro");
                break;
        }
        
        
        
        
        
        
        // Print the value using if else 
        // Status ss = Status.Failed;
        // if(ss == Status.Runnig)
        //     System.out.println("All good");
        // else if(ss == Status.Failed)
        //     System.out.println("Try again");
        // else if(ss == Status.Pending)
        //     System.out.println("Please wait");
        // else if(ss == Status.Success)
        //     System.out.println("Its donee");

        
        // Status ss = Status.Pending;
        // System.out.println(ss.ordinal()); // This is you indexing.
        // System.out.println(ss);
        
        // Status[] ss = Status.values(); // This is print all the variables you pass in the enum class with the help of array.

        // Access all the value with the help of (enhanced for loop).
        // for(Status s : ss) {
        //     System.out.println(s + " : " + s.ordinal());
        // }

    }
    
}


// Another example of enum 

/*
enum Laptop {
    Macebook(2000), Surface(1500), XPS(2200), Thinkpad(1800);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enum {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macebook; // In enum you call you method/constructor like this.
        // System.out.println(lap + " : " + lap.getPrice());


        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
*/