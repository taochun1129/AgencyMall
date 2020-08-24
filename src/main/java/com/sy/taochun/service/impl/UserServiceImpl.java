package com.sy.taochun.service.impl;

import com.sy.taochun.mapper.UserMapper;
import com.sy.taochun.model.AuUser;
import com.sy.taochun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public AuUser findByUsername(String username) throws Exception {
        System.out.println("username：" + username);
        return mapper.findByUsername(username);
    }
}
