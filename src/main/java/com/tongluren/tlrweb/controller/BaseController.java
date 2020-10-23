package com.tongluren.tlrweb.controller;

import com.tongluren.tlrweb.service.HouseService;
import com.tongluren.tlrweb.service.OrderService;
import com.tongluren.tlrweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/20 13:00
 */
@RequestMapping("/api")
public class BaseController {
    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    @Autowired
    HouseService houseService;
}
