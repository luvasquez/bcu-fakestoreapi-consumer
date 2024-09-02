package hn.com.cuscatlan.bcu_fakestoreapi_consumer.service;


import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderPayRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderPayResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderResponse;

public interface OrderService {

    OrderResponse getOrderDetail(final Integer id);

    OrderResponse saveOrder(final OrderRequest orderRequest);

    OrderResponse updateOrder(final OrderRequest orderRequest);

    void deleteOrder(final Integer id);

    OrderPayResponse checkoutPay(final OrderPayRequest orderPayRequest);

    OrderPayResponse processPay(final Integer orderPayId);

    void sendArticlesOrderToAdress(final Integer orderPayId);

}
