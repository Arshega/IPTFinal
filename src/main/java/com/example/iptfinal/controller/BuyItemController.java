package com.example.iptfinal.controller;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;
import com.example.iptfinal.model.Solve;
import com.example.iptfinal.response.BuyItemListResponse;
import com.example.iptfinal.response.ItemListResponse;
import com.example.iptfinal.response.SystemResponse;
import com.example.iptfinal.service.BuyItemService;
import com.example.iptfinal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuyItemController {
    @Autowired
    private BuyItemService buyItemService;
    @Autowired
    private ItemService itemService;

    @RequestMapping(value="/buyItem",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SystemResponse buyItem(
            @RequestBody Buy buy
    ) {
        int quan = buy.getQuantity();
        int id = buy.getId();
        int price = itemService.getPriceItems(id);
        Solve math = new Solve();
        int total = math.Sump(quan,itemService.getPriceItems(id));
        buyItemService.saveBuys(buy);
        return new SystemResponse(true, "your total bill is:" + total);
    }

//    @RequestMapping(value="/buyMyItem",
//            method = RequestMethod.GET,
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public SystemResponse BuymyItem(
//            @RequestBody Buy buy
//    ) {
//        Solve math = new Solve();
//        int total = math.Sump();
//        //buyItemService.saveBuys(buy);
//        return new SystemResponse(true, "your total bill is:" + total);
//    }
}
