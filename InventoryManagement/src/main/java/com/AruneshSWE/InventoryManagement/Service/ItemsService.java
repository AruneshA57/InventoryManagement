package com.AruneshSWE.InventoryManagement.Service;

import com.AruneshSWE.InventoryManagement.Exception.UserNotFoundException;
import com.AruneshSWE.InventoryManagement.model.Items;
import com.AruneshSWE.InventoryManagement.repository.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ItemsService {

    public final ItemsRepo itemsRepo;

    @Autowired
    public ItemsService(ItemsRepo itemsRepo) {
        this.itemsRepo = itemsRepo;
    }

    public Items addItems(Items items) {
        items.setItemsCode(UUID.randomUUID().toString());
        return itemsRepo.save(items);
    }

    public List<Items> findAllItems() {
        return itemsRepo.findAll();
    }

    public Items updateItems(Items items) {
        return itemsRepo.save(items);
    }

    public void deleteItemsById(Long id) {
        itemsRepo.deleteItemsById(id);
    }

    public Items findItemsById(Long id)  {
        return itemsRepo.findItemsById(id);
    }

    public  List<Items> findItemsByItemsName(String itemsName) {return itemsRepo.findItemsByItemsName(itemsName);}
}
