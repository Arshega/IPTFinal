package com.example.iptfinal.response;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;

import java.util.List;

public class BuyItemListResponse {
    private SystemResponse systemResponse;

    private List<Buy> buys;

    public BuyItemListResponse() {
    }

    public BuyItemListResponse(SystemResponse systemResponse, List<Buy> buy) {
        this.systemResponse = systemResponse;
        this.buys = buy;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<Buy> getBuys() {
        return buys;
    }

    public void setBuys(List<Buy> buy) {
        this.buys = buy;
    }
}
