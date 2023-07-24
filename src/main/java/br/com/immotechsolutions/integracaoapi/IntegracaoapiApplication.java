package br.com.immotechsolutions.integracaoapi;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.immotechsolutions.integracaoapi.entities.PropertyResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@SpringBootApplication
public class IntegracaoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracaoapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws IOException {
		return args -> {
			OkHttpClient client = new OkHttpClient();
	
	        Request request = new Request.Builder()
	                .url("https://cmsapi.sistema.cim.br/apps/K8CDECDGPV4MZR3HJMPMIEBK1WB4IDNVD3OBK46NNRSLZMY2AKKH2W5TLVRJT5DQ/properties")  // substitua com a URL da API
	                .build();
	
	        try (Response response = client.newCall(request).execute()) {
	            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
	
	            ObjectMapper objectMapper = new ObjectMapper();
	            objectMapper.registerModule(new JavaTimeModule());
	            String jsonResponse = response.body().string(); // Lê o corpo da resposta como string
	            PropertyResponse propertyResponse = objectMapper.readValue(jsonResponse, PropertyResponse.class); // Deserializa a string JSON para a classe PropertyResponse
	
	            // Agora você tem seu objeto `PropertyResponse` e pode trabalhar com ele.
	            // Não parece que você tenha uma variável gson definida, então aqui está como você pode imprimir o objeto usando o Jackson ObjectMapper em vez disso:
	            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(propertyResponse));
	        }
		};
	}
	
}