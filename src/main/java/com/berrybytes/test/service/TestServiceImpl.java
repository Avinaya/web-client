package com.berrybytes.test.service;

import com.berrybytes.test.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService{


    @Override
    public List<User> getUserData() {
        WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com/todos");

        Mono<List<User>> response = webClient.get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<User>>() {});
        return response.block();
    }
}
