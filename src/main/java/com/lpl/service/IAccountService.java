package com.lpl.service;

import com.lpl.bean.Account;

/**
 * 账户service接口
 */
public interface IAccountService {
    /**
     * 根据id查询账户信息
     */
    Account findAccoutById(Integer id);
}
