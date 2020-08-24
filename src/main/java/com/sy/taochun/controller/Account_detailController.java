package com.sy.taochun.controller;

import com.sy.taochun.model.Account_detail;
import com.sy.taochun.model.base.BaseResult;
import com.sy.taochun.service.Account_detailService;
import com.sy.taochun.service.impl.Account_detailServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限操作
 */
@RestController
@RequestMapping("/account")
public class Account_detailController {

    @Autowired
    private Account_detailService service = new Account_detailServiceImpl();

    @RequiresPermissions("/account/find.do")
    @RequestMapping("/account.do")
    public BaseResult findFunc(Integer id)throws Exception{

        Account_detail byId = service.findById(id);
        BaseResult baseResult = new BaseResult();
        baseResult.setData(byId);
        baseResult.setCode(BaseResult.CODE_SUCCESS);
        baseResult.setMsg(BaseResult.MSG_SUCCESS);
        return baseResult;
    }


    /*@RequestMapping("/add.do")
    @RequiresPermissions("/func/add.do")
    public BaseResult addFunc(Account_detail detail, HttpSession session) throws Exception{
        detail.setCreationTime(new Date());
        Integer save = service.save(func,()session.getAttribute("sessionUser"));
        BaseResult baseResult = new BaseResult();
        if(save!=null && save !=0){
            baseResult.setMsg(BaseResult.MSG_SUCCESS);
            baseResult.setCode(BaseResult.CODE_SUCCESS);
        }else{
            baseResult.setMsg(BaseResult.MSG_FAILED);
            baseResult.setCode(BaseResult.CODE_FAILED);
        }
        return baseResult;
    }*/
}
