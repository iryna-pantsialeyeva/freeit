package task8.booktasks.atm;

public class Main {

    public static void main(String[] args) {

        Atm atm = new Atm(1, 2, 5);

        System.out.println("Make cash deposits (confirm amount of added money with denomination of banknotes): ");
        int addedUsd100Banknote = 50;
        int addedUsd50Banknote = 2;
        int addedUsd20Banknote = 5;
        System.out.println("USD100 banknote(s): " + addedUsd100Banknote);
        System.out.println("USD50 banknote(s): " + addedUsd50Banknote);
        System.out.println("USD20 banknote(s): " + addedUsd20Banknote);

        atm.topUpCount(addedUsd100Banknote, addedUsd50Banknote, addedUsd20Banknote);

        int neededMoney = 300;
        System.out.print("\nHow much money to withdraw (write amount of money): ");

        atm.isEnoughForWithdraw(neededMoney);
        atm.print(neededMoney);
    }
}
