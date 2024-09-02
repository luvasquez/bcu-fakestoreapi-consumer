package hn.com.cuscatlan.bcu_fakestoreapi_consumer.dto.mapper;


import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.request.ClientRequest;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.controller.response.ClientResponse;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.Client;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client toClient(final ClientRequest clientRequest);

    ClientResponse toClientResponse(final Client client);

}
