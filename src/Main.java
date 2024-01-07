public class Main {
    public static void main(String[] args) {
       Person fran  = new Person("F. Preta", 1500);
       Person mau = new Person("M. Maurício", 350);

       fran.spendCash(35);
       fran.withdraw(50);
       fran.spendCash(35);
       fran.checkBalance();

       mau.withdraw(50);
       mau.spendCash(40);
       mau.checkBalance();
    }
}