package hn.com.cuscatlan.bcu_fakestoreapi_consumer.repository;


import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.OrderPay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPayRepository extends JpaRepository<OrderPay, Integer> {
}
