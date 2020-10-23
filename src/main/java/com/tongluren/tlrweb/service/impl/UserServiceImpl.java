package com.tongluren.tlrweb.service.impl;

import com.tongluren.tlrweb.dao.entity.UserEntity;
import com.tongluren.tlrweb.dao.repo.UserRepo;
import com.tongluren.tlrweb.domain.model.User;
import com.tongluren.tlrweb.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/23 14:51
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User login(String email, String password) {
        UserEntity userEntity = this.userRepo.findByEmailAndPassword(email,password);
        if (userEntity != null) {
            User user = new User();
            BeanUtils.copyProperties(userEntity, user);
            return user;
        }
        return null;
    }

    @Override
    public User register(String email, String password) {
        return null;
    }
}
