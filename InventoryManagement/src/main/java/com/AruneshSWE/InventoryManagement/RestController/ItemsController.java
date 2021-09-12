package com.AruneshSWE.InventoryManagement.RestController;
import com.AruneshSWE.InventoryManagement.Service.ItemsService;
import com.AruneshSWE.InventoryManagement.model.Items;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsController {
    private final ItemsService itemsService ;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public ResponseEntity<List<Items>> getAllItems (){
        List<Items> items = itemsService.findAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Items> getItemsById(@PathVariable("id") Long id) throws Throwable {
        Items items = itemsService.findItemsById(id);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Items> addItems(@RequestBody Items items){
        Items newItems = itemsService.addItems(items);
        return new ResponseEntity<>(newItems, HttpStatus.CREATED);
    }

}
