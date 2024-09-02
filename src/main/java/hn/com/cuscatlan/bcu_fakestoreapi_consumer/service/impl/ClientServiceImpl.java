package hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.impl;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.ClientRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ClientResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.dto.mapper.ClientMapper;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.repository.ClientRepository;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.ClientService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    @NonNull
    private final ClientRepository clientRepository;

    @NonNull
    private final ClientMapper clientMapper;

    @Override
    public ClientResponse save(final ClientRequest clientRequest) {
        return clientMapper.toClientResponse(clientRepository.save(clientMapper.toClient(clientRequest)));
    }

    @Override
    public ClientResponse getById(final Integer id) {
        return clientMapper.toClientResponse(
                clientRepository.findById(id)
                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND))
        );
    }
}
