package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;
    private String name;
    private String category;
    private String purchaseDate;
    private double purchasePrice;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private portfolio portfolio;
    public security(){


    }
    public security(String name , String category , String purchaseDate , double purchasePrice, int quantity , portfolio portfolio){
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public com.wellsfargo.counselor.entity.portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(com.wellsfargo.counselor.entity.portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
