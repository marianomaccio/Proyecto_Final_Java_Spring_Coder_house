package com.coderhouse.app.service;

import com.coderhouse.app.dto.ItemDto;
import com.coderhouse.app.dto.PersonDto;
import com.coderhouse.app.entity.Item;
import com.coderhouse.app.entity.Person;
import com.coderhouse.app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public ItemDto findItemById(long id) {
        Item item= itemRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Item")));
        ItemDto itemDto = new ItemDto();
        itemDto.setDescription(item.getDescription());
        return itemDto;
    }

    public Item updateItemById(long id, Item item) {
        //validar person
        Item itemResponse = itemRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Item")));
        itemResponse.setDescription(item.getDescription());
        itemRepository.save(itemResponse);
        return itemResponse;
    }

    public Item createItem(Item item) {
        //validar person
        itemRepository.save(item);
        return item;
    }

    public Item deleteItemById(long id) {
        Item item= itemRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Item")));
        itemRepository.deleteById(id);
        return item;
    }
}
