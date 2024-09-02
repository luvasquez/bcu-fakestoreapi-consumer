package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderPayRequest {

    private Integer orderId;

    private String cardNumber;

    private String cardHolderName;

    private String cardExpiryMm;

    private String cardExpiryYy;

    private String cardCvv;
}
