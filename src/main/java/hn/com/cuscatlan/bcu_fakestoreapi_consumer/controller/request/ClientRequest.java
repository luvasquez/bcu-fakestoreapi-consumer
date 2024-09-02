package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
    private Integer id;
    private String name;
    private String lastName;
    private String dui;
    private String email;
    private String address;
    private String usr;
    private String pwd;
}
