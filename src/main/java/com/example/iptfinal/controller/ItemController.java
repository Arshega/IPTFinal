package com.example.iptfinal.controller;

import com.example.iptfinal.entity.Item;
import com.example.iptfinal.response.ItemListResponse;
import com.example.iptfinal.response.SystemResponse;
import com.example.iptfinal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value="/addItem",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse addItem(
            @RequestBody Item item
    ) {
        itemService.saveItems(item);
        return new SystemResponse(true, item.getItemName() + " is added successfully.");
    }

    @RequestMapping(value = "/itemList",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)

    @ResponseBody
    public ItemListResponse getItem(){
        ItemListResponse clr = new ItemListResponse();
        //fetching all customers found on the database.
        clr.setItems(itemService.getItems());
        SystemResponse systemResponse = new SystemResponse(true,"Fetching all the Items are successful.");
        clr.setSystemResponse(systemResponse);
        return clr;
    }
}
