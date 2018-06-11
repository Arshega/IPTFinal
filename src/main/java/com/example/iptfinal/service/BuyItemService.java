package com.example.iptfinal.service;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;

import java.util.List;

public interface BuyItemService {
    List<Buy> getBuys();
    void saveBuys(Buy buy);
}
