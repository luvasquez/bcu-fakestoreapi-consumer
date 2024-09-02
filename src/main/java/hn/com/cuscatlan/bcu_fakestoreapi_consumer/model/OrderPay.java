package hn.com.cuscatlan.bcu_fakestoreapi_consumer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "order_pay")
@Getter
@Setter
@NoArgsConstructor
public class OrderPay implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne()
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @Column
    private String cardNumber;

    @Column
    private String cardHolderName;

    @Column
    private String cardExpiryMm;

    @Column
    private String cardExpiryYy;

    @Column
    private String cardCvv;

    @Column
    private String status;
}
