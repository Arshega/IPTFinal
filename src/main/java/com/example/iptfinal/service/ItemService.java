package com.example.iptfinal.service;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems();
    void saveItems(Item item);
    Item item = new Item();
    int getPriceItems(int id);

}
