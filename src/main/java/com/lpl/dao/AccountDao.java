package com.lpl.dao;

import com.lpl.bean.Account;

/**
 * 账户dao接口
 */
public interface AccountDao {

    /**
     * 根据账户id查询账户信息
     */
    Account findAccountById(Integer id);
}
