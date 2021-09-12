package com.AruneshSWE.InventoryManagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Items implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemsName;
    private String category;
    private String cost;
    private String availableQty;
    private String itemsCode;

    public Items(Long id, String itemsName, String category, String cost, String availableQty, String itemsCode) {
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

    public String getCategory() {
        return category;
    }


    public String getCost() {
        return cost;
    }

    public String getAvailableQty() {
        return availableQty;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemsName(String dressName) {
        this.itemsName = dressName;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setAvailableQty(String availableQty) {
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
