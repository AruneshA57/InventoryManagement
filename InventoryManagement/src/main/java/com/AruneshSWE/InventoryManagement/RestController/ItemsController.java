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
    private final ItemsService itemsService;
    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public ResponseEntity<List<Items>> getAllItems() {
        List<Items> items = itemsService.findAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping(value = "/find")
    public ResponseEntity<Items> getItemsById(@RequestParam(value = "person", defaultValue = "1") String j) throws Throwable {
        Long id = Long.valueOf(j);
        Items items = itemsService.findItemsById(id);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping(value = "/findName")
    public ResponseEntity<List<Items>> getItemsByItemsName(@RequestParam(value = "person") String Name) throws Throwable {
        List<Items> items = itemsService.findItemsByItemsName(Name);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Items> addItems(@RequestBody Items items) {
        Items newItems = itemsService.addItems(items);
        return new ResponseEntity<>(newItems, HttpStatus.CREATED);
    }

//    @PutMapping(value="update")
//    public



}
