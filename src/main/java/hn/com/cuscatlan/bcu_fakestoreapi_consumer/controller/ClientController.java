package hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.ClientRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ClientResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.ClientService;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor()
public class ClientController {

    @NonNull
    private final ClientService clientService;

    @NonNull
    private final PasswordEncoder passwordEncoder;

    @GetMapping(path ="/{id}")
    @ResponseStatus(OK)
    public ClientResponse getById(@PathVariable("id") Integer id) {
        return clientService.getById(id);
    }

    @PostMapping("/")
    @ResponseStatus(CREATED)
    public ClientResponse save(@Valid @RequestBody final ClientRequest clientRequest) {
        clientRequest.setPwd(passwordEncoder.encode(clientRequest.getPwd()));
        return  clientService.save(clientRequest);
    }

}
