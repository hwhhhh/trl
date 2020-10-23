package com.tongluren.tlrweb.controller;

import com.tongluren.tlrweb.utlis.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/23 14:47
 */
@RestController
@Slf4j
public class UserController extends BaseController {

    @PostMapping("/users")
    public ResponseData register(@RequestParam("email") String email,@RequestParam("password") String password) {
        return null;
    }

    /**
     * 用户登录（请求方式还未测试是否可行，不知道与注册会不会冲突）
     * @param email
     * @param password
     * @return
     */
    @RequestMapping("/users")
    public ResponseData login(@RequestParam("email") String email,@RequestParam("password") String password) {
        return null;
    }

    public ResponseData updateUserInfo() {
        return null;
    }
}
