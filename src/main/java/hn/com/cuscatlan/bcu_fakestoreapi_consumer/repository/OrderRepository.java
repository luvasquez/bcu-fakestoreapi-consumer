package hn.com.cuscatlan.bcu_fakestoreapi_consumer.repository;



import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    Optional<Order> findByClientId(final Integer id);

}
