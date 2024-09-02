package hn.com.cuscatlan.bcu_fakestoreapi_consumer.dto.mapper;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderDetailRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderDetailResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.OrderDetail;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface OrderDetailMapper {

    OrderDetail toOrderDetail(final OrderDetailRequest orderDetailRequest);

    OrderDetailResponse toOrderResponse(final OrderDetail orderDetail);
}