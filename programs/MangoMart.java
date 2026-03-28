// Class named "Market"
class Market
{
    int mangoPrice = 10;   // data 

    // Method(Function) named giveMeMango  - Behavior
    public String giveMeMango(int money)
    {
        System.out.println("Price of 1kg mango is $" + mangoPrice);
        System.out.println("You gave $" + money);

        if(money == 10){
            return "Here is your 1kg Mango. Visit again!";
        } else if (money > 10){
            return ("Here is your mango and your change $" + (money - 10));
        } else {
            return ("Insufficient money! you are $" + (10 - money) + " short. 1kg mango is $10");
        }
    }
}


// Main class (This is where the program starts running)
public class MangoMart
{

    // Main method (This is entry point of every java program)
    public static void main(String args[])
    {
        int money = 11;

        // creates an object of class Market 
        Market mangoMart = new Market();   
        // here mangoMart is not an object but a reference variable to the object
        // and the object will be created inside a heap memory
        
        // Calls the method and stores the return value
        String shopping = mangoMart.giveMeMango(money);

        System.out.println(shopping);
    }
}


// Key concepts 
// Class --> Blueprint 
// Object --> Instance of class (Real thing created from a class)
// Method --> Function inside class