package homework4_2;

public class Atm {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    //    Добавление денег
    public void addBanknotes(int addBanknote20, int addBanknote50, int addBanknote100) {
        this.banknote20 += addBanknote20;
        this.banknote50 += addBanknote50;
        this.banknote100 += addBanknote100;

        int addAmount = (addBanknote20 * 20) + (addBanknote50 * 50) + (addBanknote100 * 100);
        System.out.println("Успешно внесено +" + addAmount + "$.");
        System.out.println("Всего в банкомате купюр номиналом 100: " + banknote100 + ", купюр номиналом 50: " + banknote50 + ", купюр номиналом 20: " + banknote20 + ".");
    }

    // Снятие денег
    public boolean giveMoney(int amount) {
        if (amount % 10 != 0) {
            System.out.println("Размена нет. Cумма снятия должна быть кратна 10.");
            return false;
        }
        int allAtmMoney = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        if (allAtmMoney < amount) {
            System.out.println("В банкомате недостаточно средств.");
            return false;
        }
        int giveBanknote20;
        int giveBanknote50;
        int giveBanknote100;

        giveBanknote100 = Math.min(amount / 100, banknote100);
        int remain = amount - giveBanknote100 * 100;

        giveBanknote50 = Math.min(remain / 50, banknote50);
        remain -= giveBanknote50 * 50;

        if (remain % 20 == 0) {
            giveBanknote20 = remain / 20;
            if (giveBanknote20 <= banknote20) {
                banknote100 -= giveBanknote100;
                banknote50 -= giveBanknote50;
                banknote20 -= giveBanknote20;
                System.out.println("Успешно выдана сумма " + amount + ". Купюры 100: " + giveBanknote100 + ". Купюры 50: " + giveBanknote50 + ". Купюры 20: " + giveBanknote20 + ".");
                return true;
            } else {
                System.out.println("Недостаточно купюр номиналом 20 для выдачи денег.");
                return false;
            }
        }
        System.out.println("Невозможно выдать сумму имеющимися купюрами.");
        return false;
    }
}