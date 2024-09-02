package hn.com.cuscatlan.bcu_fakestoreapi_consumer.repository;


import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    public Client findByUsr(String usr);

}
