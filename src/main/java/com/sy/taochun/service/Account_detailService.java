package com.sy.taochun.service;

import com.github.pagehelper.PageInfo;
import com.sy.taochun.model.Account_detail;

import java.util.List;

public interface Account_detailService {

    void save(Account_detail func) throws Exception;

    Integer removeById(Integer id) throws Exception;

    Integer modify(Account_detail func) throws Exception;

    PageInfo findByPage() throws Exception;

    Account_detail findById(Integer id) throws Exception;

    /**
     * 按roleId查询所有func
     * @param id
     * @return
     * @throws Exception
     */
    List<Account_detail> findByRoleId(Integer id) throws Exception;

    /**
     * 根据角色删除权限
     * @param roleId
     * @return
     * @throws Exception
     */
    Integer removeFuncByRoleId(Integer roleId) throws Exception;
    /**
     * 根所角色增加权限
     * @param roleId
     * @param funcIds
     * @return
     * @throws Exception
     */
    Integer saveFuncByRoleId(
            Integer roleId,
            Integer[] funcIds,
            String createdBy) throws Exception;


}
