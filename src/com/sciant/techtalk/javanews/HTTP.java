package com.sciant.techtalk.javanews;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

// Since Java 9

public class HTTP {

  public static void main(String[] args)
      throws URISyntaxException, IOException, InterruptedException {

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("https://ipecho.net/plain"))
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

    System.out.println("My IP is: " + response.body());
  }
}
