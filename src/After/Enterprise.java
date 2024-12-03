package After;


import java.util.ArrayList;

public class Enterprise {
    private ArrayList<Employee> employees;
    private PaiementService paiementService;

    public void payEmployeesForPeriod(int weeksPerPeriod){
        for (Employee emp: employees){
            emp.payForPeriod(weeksPerPeriod);
        }
    }

    private float calculateSalaryOwed(int weeksPerPeriod, int weeklySalary) {
        return weeksPerPeriod * weeklySalary;
    }
}

