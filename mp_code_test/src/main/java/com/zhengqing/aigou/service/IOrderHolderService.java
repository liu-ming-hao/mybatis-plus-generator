package com.zhengqing.aigou.service;

import com.zhengqing.aigou.model.OrderHolder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhengqing
 * @since 2020-12-18
 */
public interface IOrderHolderService extends IService<OrderHolder>{
    public List<OrderHolder> findList(OrderHolder orderHolder);
    public void insert(OrderHolder orderHolder);
    public boolean updateById(OrderHolder orderHolder);
    public void deleteById(String id);
    public OrderHolder getById(String id);
}
