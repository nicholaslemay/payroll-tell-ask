package Before;


import java.util.ArrayList;

public class Enterprise {
    private ArrayList<Employee> employees;
    private PaiementService paiementService;

    public void payEmployeesForPeriod(int weeksPerPeriod){
        for (Employee emp: employees){
            int bankNumber = emp.getBankNumber();
            int weeklySalary =emp.getWeeklySalary();
            float amountOwed = calculateSalaryOwed(weeksPerPeriod, weeklySalary);
            paiementService.makePayment(bankNumber, bankNumber);
        }
    }

    private float calculateSalaryOwed(int weeksPerPeriod, int weeklySalary) {
        return weeksPerPeriod * weeklySalary;
    }
}

