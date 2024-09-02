package hn.com.cuscatlan.bcu_fakestoreapi_consumer.repository;



import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

    List<OrderDetail> findOrderDetailsByIdNotIn(List<Integer> ids);

}
