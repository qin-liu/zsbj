package net.zsbj.service.impl;

import com.alibaba.fastjson.JSON;
import net.zsbj.dao.UserMapper;
import net.zsbj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;


    public String getUserJsonObject() {
        User user = userMapper.getUserById(1);
        return JSON.toJSONString(user);
    }

}
