package hn.com.cuscatlan.bcu_fakestoreapi_consumer.dto.mapper;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.Order;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toOrder(final OrderRequest orderRequest);

    OrderResponse toOrderResponse(final Order order);
}
