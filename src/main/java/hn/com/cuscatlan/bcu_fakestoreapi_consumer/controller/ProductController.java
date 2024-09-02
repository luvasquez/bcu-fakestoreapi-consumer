package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ProductResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.ProductService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor()
public class ProductController {

    @NonNull
    private final ProductService productService;

    @GetMapping("/")
    @ResponseStatus(OK)
    List<ProductResponse> getProductList() {
        return productService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(OK)
    public ProductResponse getProductById(@PathVariable("id") Integer id) {
        return productService.findById(id);
    }

}
