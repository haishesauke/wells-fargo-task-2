package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolio;
    private String name;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private client client;
    @OneToMany(mappedBy = "portfolio" , cascade = CascadeType.ALL)
    private List<security> securities;

    public portfolio(){

    }

    public portfolio(String name , client client){
        this.name = name;
        this.client = client;
    }

    public long getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(long portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.wellsfargo.counselor.entity.client getClient() {
        return client;
    }

    public void setClient(com.wellsfargo.counselor.entity.client client) {
        this.client = client;
    }
}
