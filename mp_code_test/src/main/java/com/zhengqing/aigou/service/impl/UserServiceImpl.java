package com.zhengqing.aigou.service.impl;

import com.zhengqing.aigou.domain.User;
import com.zhengqing.aigou.mapper.UserMapper;
import com.zhengqing.aigou.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
