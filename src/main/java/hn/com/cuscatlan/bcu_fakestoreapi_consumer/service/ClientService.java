package hn.com.cuscatlan.bcu_fakestoreapi_consumer.service;


import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.ClientRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ClientResponse;

public interface ClientService {

    ClientResponse save(final ClientRequest clientRequest);

    ClientResponse getById(final Integer id);
}
