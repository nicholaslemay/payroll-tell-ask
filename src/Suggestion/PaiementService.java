package Suggestion;

import java.net.http.HttpClient;
import java.util.List;

public class PaiementService {

    public void makePayments(List<Pay> employeesPayForPeriod) {
        HttpClient client = HttpClient.newBuilder()
                .build();

        //do some http calls
    }
}
