public class Person {
    private String name;
    private Wallet wallet;
    private Bank bank;

    Person (String name, int initialMoney){
        this.name = name;
        bank = new Bank(initialMoney);
        wallet = new Wallet();

        System.out.println(name + ", welcome to Preta's Bank! You initial deposit was " + initialMoney);
        System.out.println("You current balance is: " + bank.getMoney() + " spend it wisely...");
        System.out.println("Remember! This account only allows deposits and withdrawals, if you want to spend money use your wallet.");
        addLine();
    }

    public void deposit(int amount){
        if (amount < 0) {
            System.out.println("Invalid deposit amount. Please enter a non-negative amount.");
            return;
        }

        bank.deposit(amount);
        System.out.println(name + ", your deposit of " + amount + " euros was successful!");
        System.out.println("Your current balance is: " + bank.getMoney() + " euros.");
        addLine();
    }

    public void withdraw(int amount){
        if (amount < 0) {
            System.out.println("Invalid withdrawal amount. Please enter a non-negative amount.");
            return;
        }

        if (amount > bank.getMoney()) {
            System.out.println(name + ", you don't have enough money to make this withdrawal!");
        } else {
            bank.withdraw(amount);
            wallet.saveMoney(amount);
            System.out.println(name + ", your withdrawal of " + amount + " euros was successful!");
            System.out.println("Your current balance is: " + bank.getMoney() + " euros.");
        }
        addLine();
    }

    public void spendCash(int amount) {
        if (amount < 0) {
            System.out.println("Invalid purchase amount. Please enter a non-negative amount.");
            return;
        }

        if (amount > wallet.getCash()) {
            System.out.println(name + ", you don't have enough money in your wallet to make this purchase!");
        } else {
            wallet.makeAPurchase(amount);
            System.out.println(name + ", your purchase was successful!");
            System.out.println("Your current wallet balance is: " + wallet.getCash() + " euros.");
            addLine();
        }
    }

    public void checkBalance() {
        System.out.println(name + ", your current bank balance is: " + bank.getMoney() + " euros.");
        addLine();
    }

    public void checkWallet() {
        System.out.println(name + ", you have " + wallet.getCash() + " euros in your wallet!");
        addLine();
    }

    private void addLine(){
        System.out.println("------------------------------------------------------------");
    }

}
