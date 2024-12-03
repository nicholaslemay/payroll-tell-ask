package After;

import java.net.http.HttpClient;

public class PaiementService {


    public void makePayment(int bankNumber, float amountOwed) {
        HttpClient client = HttpClient.newBuilder()
                .build();

        //do some http call
    }
}
