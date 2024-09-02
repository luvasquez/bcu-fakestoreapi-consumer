package hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.impl;


import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ProductResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Value("${url.consume.store}")
    private String url;


    @Override
    public List<ProductResponse> findAll() {
        return WebClient.create()
                .get()
                .uri(url)
                .header(HttpHeaders.USER_AGENT, "Application")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ProductResponse>>() {})
                .block();
    }

    @Override
    public ProductResponse findById(final Integer id) {
        return WebClient.create()
                .get()
                .uri(url + "/{id}", id)
                .header(HttpHeaders.USER_AGENT, "Application")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ProductResponse.class)
                .block();
    }
}
