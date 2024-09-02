package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderPayRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.OrderRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderPayResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.OrderResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.OrderService;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@CrossOrigin
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor()
public class OrderController {

    @NonNull
    private final OrderService orderService;

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public OrderResponse getOrder(@PathVariable("id") Integer id) {
        return orderService.getOrderDetail(id);
    }
    @PostMapping("/")
    @ResponseStatus(CREATED)
    public OrderResponse saveOrder(@Valid @RequestBody final OrderRequest orderRequest) {
        return orderService.saveOrder(orderRequest);
    }

    @PutMapping("/")
    @ResponseStatus(OK)
    public OrderResponse updateOrder(@Valid @RequestBody final OrderRequest orderRequest) {
        return orderService.updateOrder(orderRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(OK)
    public void deleteOrder(@PathVariable("id") Integer id) {
        orderService.deleteOrder(id);
    }

    @PostMapping("/checkout/")
    @ResponseStatus(OK)
    public OrderPayResponse checkoutOrder(@Valid @RequestBody final OrderPayRequest orderPayRequest) {
        return orderService.checkoutPay(orderPayRequest);
    }

    @PostMapping("/pay/{idOrderPay}")
    @ResponseStatus(OK)
    public OrderPayResponse payOrder(@PathVariable("idOrderPay") Integer idOrderPay) {
        return orderService.processPay(idOrderPay);
    }

    @PostMapping("/sendArticles/{idOrderPay}")
    @ResponseStatus(OK)
    public void sendArticles(@PathVariable("idOrderPay") Integer idOrderPay) {
        orderService.sendArticlesOrderToAdress(idOrderPay);
    }
}
