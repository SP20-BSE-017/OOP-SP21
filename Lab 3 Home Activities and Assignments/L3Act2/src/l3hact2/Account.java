package l3hact2;

public class Account {
    public double balance;

    Account(){
        balance = 30000;
    }

    Account(double b){
        balance = b;
    }

    public double withdraw(float wA){
        balance = balance - wA;
        return balance;
    }

    public double deposit(float dA){
        balance = balance + dA;
        return balance;
    }
}
