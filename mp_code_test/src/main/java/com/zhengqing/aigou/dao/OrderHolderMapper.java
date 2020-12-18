package com.zhengqing.aigou.dao;

import com.zhengqing.aigou.model.OrderHolder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhengqing
 * @since 2020-12-18
 */
@Repository
public interface OrderHolderMapper extends BaseMapper<OrderHolder> {

    public List<OrderHolder> findList(OrderHolder orderHolder);

}
