package After;

public class Employee{
    private String name;
    private PaiementService paymentService;
    public int getBankNumber() {
        return 815;
    }

    public int getWeeklySalary() {
        return 1000;
    }

    public void payForPeriod(int weeksPerPeriod) {
        float amountOwed = calculateSalaryOwed(weeksPerPeriod);
        paymentService.makePayment(getBankNumber(), amountOwed);
    }

    private float calculateSalaryOwed(int weeksPerPeriod) {
        return weeksPerPeriod * getWeeklySalary();
    }
}
