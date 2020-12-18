package com.zhengqing.aigou.service.impl;

import com.zhengqing.aigou.model.OrderHolder;
import com.zhengqing.aigou.dao.OrderHolderMapper;
import com.zhengqing.aigou.service.IOrderHolderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Override
    public List<OrderHolder> findList(OrderHolder orderHolder){
        List<OrderHolder> orderHolderList = orderHolderMapper.findList(orderHolder);
        return orderHolderList;
    }
    @Override
    public void insert(OrderHolder orderHolder){
        orderHolderMapper.insert(orderHolder);
    }
    @Override
    public boolean updateById(OrderHolder orderHolder){
        int updateRes = orderHolderMapper.updateById(orderHolder);
        return true;
    }
    @Override
    public void deleteById(String id){
        orderHolderMapper.deleteById(id);
    }

    @Override
    public OrderHolder getById(String id) {
        OrderHolder orderHolder = orderHolderMapper.selectById(id);
        return orderHolder;
    }
}
