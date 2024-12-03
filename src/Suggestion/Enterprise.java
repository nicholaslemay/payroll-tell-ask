package Suggestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Enterprise {
    private ArrayList<Employee> employees = new ArrayList<>();

    public List<Pay> getEmployeesPayForPeriod(int weeksPerPeriod){
       return employees.stream()
               .map(e -> e.payForPeriod(weeksPerPeriod))
               .collect(Collectors.toList());
    }
}

