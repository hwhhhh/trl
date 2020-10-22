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
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User Login(String email, String password) {
        UserEntity userEntity = this.userRepo.findByEmailAndPassword(email,password);
        if (userEntity != null) {
            User user = new User();
            BeanUtils.copyProperties(userEntity, user);
            return user;
        }
        return null;
    }
}
