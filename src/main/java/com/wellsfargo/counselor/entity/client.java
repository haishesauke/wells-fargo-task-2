package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String name;
    private String email;
    private String phone;
    private String address;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor Advisor;

    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL)
    private List<portfolio> portfolios;
    public client(){

    }

    public client(String name , String email ,  String phone , String address , Advisor Advisor){
        this.name = name ;
        this.email = email;
        this.phone = phone;
        this.Advisor = Advisor;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public com.wellsfargo.counselor.entity.Advisor getAdvisor() {
        return Advisor;
    }

    public void setAdvisor(com.wellsfargo.counselor.entity.Advisor advisor) {
        Advisor = advisor;
    }

}
