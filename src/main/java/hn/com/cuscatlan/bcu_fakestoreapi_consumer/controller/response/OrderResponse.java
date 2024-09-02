package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.Client;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Integer id;
    private String orderDescription;
    private Client client;
    List<OrderDetailResponse> details;
}

