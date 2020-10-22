package com.tongluren.tlrweb.dao.repo;

import com.tongluren.tlrweb.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/22 12:26
 */
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmailAndPassword(String email, String password);
}
