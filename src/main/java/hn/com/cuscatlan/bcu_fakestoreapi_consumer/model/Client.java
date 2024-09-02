package hn.com.cuscatlan.bcu_fakestoreapi_consumer.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true)
    private String dui;

    @Column(unique = true)
    private String email;

    @Column
    private String address;

    @Column
    private String usr;
    @Column
    private String pwd;

    @JsonIgnore
    @CreationTimestamp
    @Column(updatable = false)
    private Date fechaIngreso;
}

