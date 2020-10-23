package com.tongluren.tlrweb.service;

import com.tongluren.tlrweb.dao.entity.UserEntity;
import com.tongluren.tlrweb.dao.repo.UserRepo;
import com.tongluren.tlrweb.domain.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/20 13:01
 */
public interface UserService {
    /**
     * 用户登录
     * @param email 用户邮箱
     * @param password 用户密码
     * @return 返回用户相关数据
     */
    User login(String email, String password);

    /**
     * 用户注册
     * @param email 用户邮箱
     * @param password 用户密码
     * @return 返回用户相关数据
     */
    User register(String email, String password);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    boolean updateUserInfo(User user);
}
