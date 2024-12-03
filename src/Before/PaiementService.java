package Before;

import java.net.http.HttpClient;

public class PaiementService {


    public void makePayment(int bankNumber, int bankNumber1) {
        HttpClient client = HttpClient.newBuilder()
                .build();

        //do some http call
    }
}
