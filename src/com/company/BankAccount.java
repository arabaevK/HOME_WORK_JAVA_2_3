package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) throws LimitException {
        amount += sum;
        System.out.println("Ваш счёт пополнен на: " + getAmount() + "Coм");
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка. Недостаточно средств на счёте: ", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + " Cом " + "На ващем счету: " + amount);
        }

    }

}
