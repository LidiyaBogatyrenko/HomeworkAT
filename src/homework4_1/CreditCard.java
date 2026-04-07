package homework4_1;

public class CreditCard {
    String accountNumber;
    int currentAmount;

    public CreditCard(String accountNumber, int initialAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = initialAmount;
    }

    public void getInfo() {
        System.out.println("Номер счёта: " + accountNumber + ". Текущая сумма на счету: " + currentAmount);
    }

    public void credit(int amount) {
        this.currentAmount += amount;
        System.out.println();
    }

    public void debit(int amount) {
        if (currentAmount < amount) {
            System.out.println("На карте недостаточно средств.");
        } else if (currentAmount >= amount) {
            this.currentAmount -= amount;
            System.out.println("Успешное снятие средств с карты МИР -" + amount + "р.");
        }
    }
}