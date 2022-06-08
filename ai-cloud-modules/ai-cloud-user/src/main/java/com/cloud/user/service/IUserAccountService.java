package com.cloud.user.service;

import com.cloud.auth.api.domain.UserAccount;
import com.cloud.user.param.AccountParam;

import java.util.List;

/**
 * 用户账户信息Service接口
 *
 * @author ai-cloud
 */
public interface IUserAccountService {

    /**
     * 创建账户
     *
     * @param userId
     * @param uuid
     * @param type
     * @return
     */
    public int createAccount(String userId, String uuid, String type);


    /**
     * 钱包余额
     *
     * @return
     */
    public String wallet();

}
