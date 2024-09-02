package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private Integer idClient;
    private List<OrderDetailRequest> products;
}

