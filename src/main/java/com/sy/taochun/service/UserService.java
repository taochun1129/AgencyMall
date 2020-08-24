package com.sy.taochun.service;

import com.sy.taochun.model.AuUser;

public interface UserService {

    AuUser findByUsername(String username) throws Exception;

}
