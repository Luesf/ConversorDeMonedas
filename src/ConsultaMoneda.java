import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public MonedaConvertir buscaMoneda(String moneda, String monedaDos){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8b49d6c0a1f6b56072c315ba/pair/"+ moneda +"/"+ monedaDos);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),MonedaConvertir.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo encontrar esa moneda...");
        }

    }

}
