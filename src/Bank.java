public class Bank {
    int money;

    Bank (int initialDeposit){
        this.money = initialDeposit;
    }
    public void deposit(int amount){
        this.money += amount;
    }

    public void withdraw(int amount){
        money -= amount;
    }

    public int getMoney() {
        return money;
    }
}
