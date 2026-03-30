
public class BankAccSys {

    public static void main(String args[]) {
        System.out.println("Welcome to JavaBank");

        BankAcc acc1 = new BankAcc();
        acc1.openAcc(1234, "Ali", 2000);
        int bal = acc1.checkBal(1234);
        System.out.println("Your balance is: $" + bal);
    }
}

class BankAcc {

    private int pin;
    private int balance = 0;
    private String accHolder;

    public void openAcc(int p, String name, int bal) {
        pin = p;
        accHolder = name;
        if (bal > 0) {
            balance = bal;
        }

        System.out.println("Congratulations " + accHolder + "! Your account has been created successfully with a balance of $" + balance);
    }

    public void deposit(int p, int m) {
        if (p == pin) {
            if(m > 0){
                balance = balance + m;
                System.out.println("Successful! credited $" + m + " in your account");
            } else {
                System.out.println("Invalid deposit amount!");
            }
        } else {
            System.out.println("Wrong pin! Try again");
        }
    }

    public void withdraw(int p, int m) {
        if(p == pin) {
            if(m > 0 && balance >= m) {
                balance = balance - m;
                System.out.println("Here is your $" + m);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Wrong pin! Try again");
        }
    }

    public int checkBal(int p){
        if(p == pin){
            return balance;
        } else {
            System.out.println("Wrong pin! Try again");
            return -1;
        }
    }
}
