package com.example.iptfinal.response;

import com.example.iptfinal.entity.Item;

import java.util.List;

public class ItemListResponse {
    private SystemResponse systemResponse;

    private List<Item> items;

    public ItemListResponse() {
    }

    public ItemListResponse(SystemResponse systemResponse, List<Item> item) {
        this.systemResponse = systemResponse;
        this.items = item;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> item) {
        this.items = item;
    }
}

