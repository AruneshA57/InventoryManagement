package com.AruneshSWE.InventoryManagement.repository;

import com.AruneshSWE.InventoryManagement.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemsRepo extends JpaRepository<Items,Long> {

   Optional<Items> findItemsById(Long id);




   void deleteItemsById(Long id);
}
