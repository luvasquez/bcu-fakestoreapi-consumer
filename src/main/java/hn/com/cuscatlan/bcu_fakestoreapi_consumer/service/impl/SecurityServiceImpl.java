package hn.com.cuscatlan.bcu_fakestoreapi_consumer.service.impl;

import hn.com.cuscatlan.bcu_fakestoreapi_consumer.model.Client;
import hn.com.cuscatlan.bcu_fakestoreapi_consumer.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class SecurityServiceImpl implements UserDetailsService {


    private final ClientRepository clientRepository;

    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        Client client = clientRepository.findByUsr(user);
        System.out.println(client);

        if(client==null) {
            throw new UsernameNotFoundException("User not found with this user"+ user);

        }

        List<GrantedAuthority> authorities = new ArrayList<>();

        return new org.springframework.security.core.userdetails.User(
                client.getUsr(),
                client.getPwd(),
                authorities);
    }
}
