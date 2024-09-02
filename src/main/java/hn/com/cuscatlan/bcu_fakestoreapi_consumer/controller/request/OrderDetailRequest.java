package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailRequest {
    private Integer idProduct;
    private Integer quantity;
}
