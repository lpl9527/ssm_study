package com.lpl.service.impl;

import com.lpl.bean.Account;
import com.lpl.dao.AccountDao;
import com.lpl.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账户service实现类
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;
    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    public Account findAccoutById(Integer id) {
        //查询账户
        Account account = accountDao.findAccountById(id);
        return account;
    }
}
