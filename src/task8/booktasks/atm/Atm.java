package task8.booktasks.atm;

/* Задание 25 (Book, Part 2, P. 25). Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
                                     банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
                                     50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
                                     снимающую деньги. На вход передается сумма денег. На выход – булевское
                                     значение (операция удалась или нет). При снятии денег функция должна
                                     рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
                                     конструктор с тремя параметрами – количеством купюр.*/
public class Atm {

    private int usd100;
    private int usd50;
    private int usd20;

    public Atm(int usd100, int usd50, int usd20) {
        this.usd20 = usd20;
        this.usd50 = usd50;
        this.usd100 = usd100;
    }

    public int getUsd20() {
        return usd20;
    }

    public int getUsd50() {
        return usd50;
    }

    public int getUsd100() {
        return usd100;
    }

    public void setUsd100(int usd100) {
        this.usd100 = usd100;
    }

    public void setUsd50(int usd50) {
        this.usd50 = usd50;
    }

    public void setUsd20(int usd20) {
        this.usd20 = usd20;
    }

    public int getAmountInAtm() {
        return getUsd100() * 100 + getUsd50() * 50 + getUsd20() * 20;
    }

    public int topUpCount(int usd100, int usd50, int usd20) {
        setUsd100(getUsd100() + usd100);
        setUsd50(getUsd50() + usd50);
        setUsd20(getUsd20() + usd20);
        return getAmountInAtm();
    }


    public boolean isEnoughForWithdraw(int neededMoney) {
        if (getAmountInAtm() >= neededMoney) {
            this.usd100 -= neededMoney / 100;
            this.usd50 -= (neededMoney % 100) / 50;
            this.usd20 -= ((neededMoney % 100) % 50) / 20;
            return true;
        }
        return false;
    }

    public void print(int neededMoney) {
        if (!isEnoughForWithdraw(neededMoney)) {
            System.out.println("Non-sufficient funds.\nTry withdrawing money from another ATM.");
        } else {
            System.out.println("Withdrawing money from an ATM ... Please wait: \nGet a transaction receipt. ");
            System.out.print("USD100 banknote(s): " + neededMoney / 100 +
                    "\nUSD50 banknote(s): " + ((neededMoney % 100) / 50) +
                    "\nUSD20 banknote(s): " + (((neededMoney % 100) % 50) / 20));
        }
    }
}
