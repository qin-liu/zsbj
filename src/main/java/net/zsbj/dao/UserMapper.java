package net.zsbj.dao;

import net.zsbj.config.mybatis.MyMapper;
import net.zsbj.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User>  {
    User getUserById(@Param("userId") Integer userId);
}
