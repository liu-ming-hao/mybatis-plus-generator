package com.zhengqing.aigou.controller;


import com.zhengqing.aigou.model.OrderHolder;
import com.zhengqing.aigou.service.IOrderHolderService;
import com.zhengqing.aigou.service.impl.OrderHolderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhengqing
 * @since 2020-12-18
 */
@Controller
@RequestMapping("/orderHolder")
public class OrderHolderController {
    @Autowired
    private IOrderHolderService orderHolderService;

    @PostMapping("/findList")
    public List<OrderHolder> findList(@RequestBody OrderHolder orderHolder){
        List<OrderHolder> orderHolderList = orderHolderService.findList(orderHolder);
        return orderHolderList;
    }
    @PostMapping("/insert")
    public void insert(@RequestBody OrderHolder orderHolder){
        orderHolderService.insert(orderHolder);
    }
    @PostMapping("/updateById")
    public void updateById(@RequestBody OrderHolder orderHolder){
        orderHolderService.updateById(orderHolder);
    }
    @PostMapping("/deleteById")
    public void deleteById(@RequestParam("id") String id){
        orderHolderService.deleteById(id);
    }
    @GetMapping("/getById")
    public OrderHolder getById(@RequestParam("id") String id){
        return orderHolderService.getById(id);
    }
}

