package com.example.iptfinal.service;

import com.example.iptfinal.dao.BuyItemDAO;
import com.example.iptfinal.dao.ItemDAO;
import com.example.iptfinal.entity.Buy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BuyItemServiceImpl implements BuyItemService {

    @Autowired
    private BuyItemDAO buyItemDAO;


    @Override
    public List<Buy> getBuys() {
        return buyItemDAO.getBuy();
    }

    @Override
    public void saveBuys(Buy buy) {
        buyItemDAO.saveBuy(buy);
    }
}
