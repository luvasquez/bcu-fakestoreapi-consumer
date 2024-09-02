package hn.com.cuscatlan.bcu_fakestoreapi_consumer.service;



import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> findAll();

    ProductResponse findById(final Integer id);
}
