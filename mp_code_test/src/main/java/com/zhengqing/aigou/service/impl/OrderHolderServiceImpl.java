package com.zhengqing.aigou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhengqing.aigou.model.OrderHolder;
import com.zhengqing.aigou.dao.OrderHolderMapper;
import com.zhengqing.aigou.service.IOrderHolderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhengqing
 * @since 2020-12-18
 */
@Service
public class OrderHolderServiceImpl extends ServiceImpl<OrderHolderMapper, OrderHolder> implements IOrderHolderService {
    @Autowired
    OrderHolderMapper orderHolderMapper;

    public List<OrderHolder> findList(OrderHolder orderHolder){
        List<OrderHolder> orderHolderList = orderHolderMapper.findList(orderHolder);
        return orderHolderList;
    }
}
