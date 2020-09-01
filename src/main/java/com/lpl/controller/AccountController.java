package com.lpl.controller;

import com.lpl.bean.Account;
import com.lpl.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 账户Controller
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 跳转到用户首页
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "account/index";
    }

    /**
     * 根据id查询账户
     */
    @RequestMapping("/{id}")
    @ResponseBody
    public Account findAccountById(@PathVariable("id") Integer id){
        Account accout = accountService.findAccoutById(id);
        return accout;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(@RequestBody Account account) {
        System.out.println(account);
    }
}
