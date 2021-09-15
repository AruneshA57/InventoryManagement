package com.AruneshSWE.InventoryManagement.repository;

import com.AruneshSWE.InventoryManagement.model.Items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ItemsRepo extends JpaRepository<Items, Long> {
    Items findItemsById(Long id);
    //@Query(value = "select items from Items items  where items.itemsName =:Name ")
    List<Items> findItemsByItemsName(String itemsName);
    void deleteItemsById(Long id);
}
