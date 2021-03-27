package com.iforum.demo.service;

import com.iforum.demo.entity.user;
import com.iforum.demo.mapper.userMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class userService implements userMapper {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(user record) {
        return 0;
    }

    @Override
    public int insertSelective(user record) {
        return 0;
    }

    @Override
    public user selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(user record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(user record) {
        return 0;
    }


}
