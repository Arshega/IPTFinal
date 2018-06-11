package com.example.iptfinal.service;

import com.example.iptfinal.dao.BuyItemDAO;
import com.example.iptfinal.dao.ItemDAO;
import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDAO;

    @Override
    public List<Item> getItems() {
        return itemDAO.getItem();
    }

    @Override
    public void saveItems(Item item) {
        itemDAO.saveItem(item);
    }

    @Override
    public int getPriceItems(int id) {
        return itemDAO.getPriceItem(id);
    }


}
