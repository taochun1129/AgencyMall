package com.sy.taochun.service.impl;

import com.github.pagehelper.PageInfo;
import com.sy.taochun.mapper.Account_detailMapper;
import com.sy.taochun.model.Account_detail;
import com.sy.taochun.service.Account_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class Account_detailServiceImpl implements Account_detailService {

    @Autowired
    private Account_detailMapper mapper;

    @Override
    public void save(Account_detail detail ) throws Exception {
        mapper.save(detail);
    }

    @Override
    public Integer removeById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Integer modify(Account_detail func) throws Exception {
        return null;
    }

    @Override
    public PageInfo findByPage() throws Exception {
        return null;
    }

    @Override
    public Account_detail findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<Account_detail> findByRoleId(Integer id) throws Exception {
        return null;
    }

    @Override
    public Integer removeFuncByRoleId(Integer roleId) throws Exception {
        return null;
    }

    @Override
    public Integer saveFuncByRoleId(Integer roleId, Integer[] funcIds, String createdBy) throws Exception {
        return null;
    }
}
