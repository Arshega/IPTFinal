package com.example.iptfinal.entity;

import javax.persistence.*;

@Entity
@Table(name="buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column
    private String buyItem;
    @Column
    private int Quantity;
    @Column
    private int Total;

    public Buy() {
    }

    public Buy(int id, String buyItem, int quantity, int total) {
        this.id = id;
        this.buyItem = buyItem;
        Quantity = quantity;
        Total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyItem() {
        return buyItem;
    }

    public void setBuyItem(String buyItem) {
        this.buyItem = buyItem;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }
}
