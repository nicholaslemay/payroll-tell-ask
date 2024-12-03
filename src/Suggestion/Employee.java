package Suggestion;

import After.PaiementService;

public class Employee{
    private PaiementService paymentService;
    public int getBankNumber() {
        return 815;
    }

    public int getWeeklySalary() {
        return 1000;
    }

    public Pay payForPeriod(int weeksPerPeriod) {
        return new Pay(getBankNumber(), salaryOwed(weeksPerPeriod));
    }

    private float salaryOwed(int weeksPerPeriod) {
        return weeksPerPeriod * getWeeklySalary();
    }
}
