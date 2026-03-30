package homework4_1;

public class CreditCard {
    String accNum;
    int currentAmount;

    public CreditCard(String accNum, int initialAmount) {
        this.accNum = accNum;
        this.currentAmount = initialAmount;
    }

    public void getInfo() {
        System.out.println("Номер счёта: " + accNum + ". Текущая сумма на счету: " + currentAmount);
    }

    public void credit(int amount) {
        this.currentAmount += amount;
    }

    public void debit(int amount) {
        this.currentAmount -= amount;
    }
}