package com.example.iptfinal.dao;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;

import java.util.List;

public interface BuyItemDAO {
    List<Buy> getBuy();
    void saveBuy(Buy buy);
}
