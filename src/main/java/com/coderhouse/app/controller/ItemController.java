package com.coderhouse.app.controller;

import com.coderhouse.app.dto.ItemDto;
import com.coderhouse.app.entity.Item;
import com.coderhouse.app.entity.Person;
import com.coderhouse.app.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("/{id}")
    public ResponseEntity<ItemDto> updateItemById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(this.itemService.findItemById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Item> updateItemById(@PathVariable(name = "id") long id, @RequestBody Item item){
        return new ResponseEntity<>(this.itemService.updateItemById(id, item), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item){
        return new ResponseEntity<>(this.itemService.createItem(item), HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Item> deleteItemById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(itemService.deleteItemById(id), HttpStatus.ACCEPTED);
    }
}
