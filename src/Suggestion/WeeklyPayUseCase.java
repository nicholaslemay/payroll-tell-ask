package Suggestion;

import java.util.List;

public class WeeklyPayUseCase {

    private PaiementService paiementService;

    public void PayEnterpriseEmployees() {
        List<Pay> employeesPayForPeriod = GetEnterprise().getEmployeesPayForPeriod(2);
        paiementService.makePayments(employeesPayForPeriod);
    }

    private Enterprise GetEnterprise() {
        //pretend we fetch enterprise from somewhere
        return new Enterprise();
    }
}
