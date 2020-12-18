package com.zhengqing.aigou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengqing.aigou.model.User;
import com.zhengqing.aigou.dao.UserMapper;
import com.zhengqing.aigou.service.IUserService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhengqing
 * @since 2019-01-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
