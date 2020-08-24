package com.sy.taochun.mapper;

import com.sy.taochun.model.AuUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserMapper extends JpaRepository<AuUser, Integer> {

    @Query(value = "select * from au_user where username=?1", nativeQuery = true)
    AuUser findByUsername(String username);

}
