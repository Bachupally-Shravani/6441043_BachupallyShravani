// 36_HTTPClientExample.java
import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class HTTPClientExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        // Example: fetching public API data (GitHub API for example)
        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://api.github.com"))
                                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Response body: ");
            System.out.println(response.body());
        } catch(IOException | InterruptedException e) {
            System.out.println("HTTP request error: " + e.getMessage());
        }
    }
}
