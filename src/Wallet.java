public class Wallet {
    int cash;

    public void makeAPurchase(int amount){
        if (amount > cash) {
            System.out.println("You dont have enough money to make this purchase!");
        } else {
            cash -= amount;
        }
    }

    public void saveMoney(int amount){
        cash += amount;
    }

    public int getCash() {
        return cash;
    }
}
