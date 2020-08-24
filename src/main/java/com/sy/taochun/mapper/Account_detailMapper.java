package com.sy.taochun.mapper;

import com.sy.taochun.model.Account_detail;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Account_detailMapper extends JpaRepository<Account_detail,Integer> {

    /*@Query(value = "insert into account_detail (accountId,accountDate,moneyIn,moneyOut,type,otherAcountId)values (#{accountId},#{accountDate},#{moneyIn},#{moneyOut},#{type}),#{otherAcountId}",nativeQuery = true)
    Integer insert(Account_detail detail) throws Exception;*/

}
