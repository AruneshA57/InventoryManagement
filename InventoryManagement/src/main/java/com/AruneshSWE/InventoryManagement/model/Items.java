package com.AruneshSWE.InventoryManagement.model;

public class Items {
    private Long id;
    private String dressName;
    private char category;
    private String dressType;
    private float cost;
    private int availableQty;

    public Items(Long id, String dressName, char category, String dressType, float cost, int availableQty) {
        this.id = id;
        this.dressName = dressName;
        this.category = category;
        this.dressType = dressType;
        this.cost = cost;
        this.availableQty = availableQty;
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

    public String getDressType() {
        return dressType;
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

    public void setDressType(String dressType) {
        this.dressType = dressType;
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
                ", dressType='" + dressType + '\'' +
                ", cost=" + cost +
                ", availableQty=" + availableQty +
                '}';
    }
}
