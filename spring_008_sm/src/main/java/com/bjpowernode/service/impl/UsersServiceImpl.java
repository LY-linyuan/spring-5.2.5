package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.UsersMapper;
import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 临渊
 * @Date 2022-08-06 21:19
 */

@Service
//@Transactional(propagation = Propagation.REQUIRED, noRollbackForClassName = "ArithmeticException")
// @Transactional(propagation = Propagation.REQUIRED)
/*@Transactional(propagation = Propagation.REQUIRED,
        noRollbackForClassName = "", // 指定发生异常不回滚
        noRollbackFor = ArithmeticException.class, // 指定发生什么异常不回滚 使用异常类型
        rollbackForClassName = "", // 指定发生什么异常必须回滚
        rollbackFor = ArithmeticException.class, // 指定发生什么异常必须回滚
        timeout = -1, // 连接超时设置默认值-1 表示永不超时
        readOnly = false, // 默认是false select 必须是true
        isolation = Isolation.DEFAULT // 隔离级别 mysql 默认 可重复读
)*/
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;
    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
