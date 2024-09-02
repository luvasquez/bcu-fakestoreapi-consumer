package hn.com.cuscatlan.bcu_fakestoreapi_consumer.dto.mapper;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderPayRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderPayResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.OrderPay;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface OrderPayMapper {

    OrderPay toOrderPay(final OrderPayRequest orderPayRequest);

    OrderPayResponse toOrderPayResponse(final OrderPay orderPay);
}
