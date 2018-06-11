package com.example.iptfinal.dao;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;

import java.util.List;

public interface ItemDAO {
    List<Item> getItem();
    void saveItem(Item item);
    //Item item = new Item();
    int getPriceItem(int id);
}
