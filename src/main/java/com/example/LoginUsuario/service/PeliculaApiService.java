package com.example.LoginUsuario.service;

import com.example.LoginUsuario.model.ListaPeliculas;
import com.example.LoginUsuario.model.Pelicula;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PeliculaApiService {

    private final String apiKey;
    private final String baseUrl;
    private final RestTemplate restTemplate;

    public PeliculaApiService(@Value("${tmdb.api.key}") String apiKey,
                              @Value("${tmdb.api.base-url}") String baseUrl,
                              RestTemplate restTemplate) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
    }

    public ListaPeliculas buscarPelicula(String query) {
        String url = baseUrl + "/search/movie";

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", MediaType.APPLICATION_JSON_VALUE);
        headers.set("Authorization", "Bearer 413b0235f4906bf138d1f131613fcb84");

        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        return restTemplate.getForObject(url + "?api_key=" + apiKey + "&query=" + query, ListaPeliculas.class, requestEntity);
    }

    public Pelicula getPelicula(Long id) {
        String url = baseUrl + "/movie/{id}?api_key=" + apiKey;
        return restTemplate.getForObject(url, Pelicula.class, id);
    }

    public ListaPeliculas getAllPeliculasFromApi() {
        String url = baseUrl + "/discover/movie?api_key=" + apiKey;

        return restTemplate.getForObject(url, ListaPeliculas.class);
    }
}
