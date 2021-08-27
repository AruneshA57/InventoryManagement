package com.AruneshSWE.InventoryManagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Items implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,updatable = false)
    private String dressName;
    @Column(nullable = false,updatable = false)
    private char category;
    @Column(nullable = false,updatable = true)
    private float cost;
    @Column(nullable = false,updatable = true)
    private int availableQty;
    @Column(nullable = false,updatable = false)
    private String itemsCode;

    public Items(Long id, String dressName, char category, float cost, int availableQty, String itemsCode) {
        this.id = id;
        this.dressName = dressName;
        this.category = category;
        this.cost = cost;
        this.availableQty = availableQty;
        this.itemsCode = itemsCode;
    }

    public Items() {
    }


    public Long getId() {
        return id;
    }

    public String getDressName() {
        return dressName;
    }

    public char getCategory() {
        return category;
    }


    public float getCost() {
        return cost;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDressName(String dressName) {
        this.dressName = dressName;
    }

    public void setCategory(char category) {
        this.category = category;
    }


    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", dressName='" + dressName + '\'' +
                ", category=" + category +
                ", cost=" + cost +
                ", availableQty=" + availableQty +
                ", itemsCode='" + itemsCode + '\'' +
                '}';
    }

    public String getItemsCode() {
        return itemsCode;
    }

    public void setItemsCode(String itemsCode) {
        this.itemsCode = itemsCode;
    }
}
