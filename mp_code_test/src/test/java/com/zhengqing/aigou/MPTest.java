package com.zhengqing.aigou;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zhengqing.aigou.domain.User;
import com.zhengqing.aigou.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//测试：增删改查+高级查询
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MPTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testAdd() throws Exception {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                User user = new User();
                user.setName("zz-" + i);
                userService.insert(user);
            } else {
                User user = new User();
                user.setName("qq-" + i);
                userService.insert(user);
            }
        }
    }

    @Test
    public void testDelete() throws Exception {
        userService.deleteById(1L);
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userService.selectById(35L);
        user.setName("修改了...");
        userService.updateById(user);
        user = userService.selectById(35L);
        System.out.println(user);
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userService.selectList(null);
        System.out.println(users);
    }

    @Test //高级查询
    public void testQueryAndPage() throws Exception {
        Page<User> page = new Page<>(1, 10); //参数1：当前页  参数2：每页显示多少条数据
        Wrapper wrapper = new EntityWrapper();
        wrapper.like("name", "z");
        userService.selectPage(page, wrapper);
        System.out.println("总数:" + page.getTotal());
        System.out.println(page.getRecords());
    }
}
