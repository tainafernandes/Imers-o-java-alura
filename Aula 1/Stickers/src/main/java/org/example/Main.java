package org.example;

import org.example.JsonParser.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        //conexão http
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI address = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(address).GET().build(); //Faço o get
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        //pegar infos (título, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listMovies = parser.parse(body);

        //Exibir e manipular os dados
        for(Map<String, String> movie : listMovies){
            System.out.println(movie.get("title"));
            System.out.println(movie.get("image"));
            System.out.println(movie.get("imDbRating"));
            System.out.println();
        }

    }
}