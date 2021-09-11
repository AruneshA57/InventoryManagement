package com.AruneshSWE.InventoryManagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Items implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,updatable = false)
    private String itemsName;
    @Column(nullable = false,updatable = false)
    private char category;
    @Column(nullable = false,updatable = true)
    private float cost;
    @Column(nullable = false,updatable = true)
    private int availableQty;
    @Column(nullable = false,updatable = false)
    private String itemsCode;

    public Items(Long id, String itemsName, char category, float cost, int availableQty, String itemsCode) {
        this.id = id;
        this.itemsName = itemsName;
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

    public String getItemsName() {
        return itemsName;
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

    public void setItemsName(String dressName) {
        this.itemsName = dressName;
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
                ", dressName='" + itemsName + '\'' +
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
