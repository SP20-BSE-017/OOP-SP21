package l3hact2;

public class L3Act2 {
    public static void main(String[] args){

        Account a1 = new Account();
        System.out.println("\nBalance before withdrawal is: " + a1.balance);
        System.out.println("New balance is: " + (a1.withdraw(1300)));

        Account a2 = new Account();
        System.out.println("\nBalance before deposit is: " + a2.balance);
        System.out.println("New balance is: " + (a2.deposit(1300)));

        Account a3 = new Account(45000);
        System.out.println("\nBalance before deposit is: " + a3.balance);
        System.out.println("New balance is: " + (a3.deposit(1500)));
        System.out.println("\nBalance before withdrawal is: " + a3.balance);
        System.out.println("New balance is: " + (a3.withdraw(2300)));
    }
}
