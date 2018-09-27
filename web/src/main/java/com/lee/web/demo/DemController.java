package com.lee.web.demo;

import com.lee.entity.demo.User_C;
import com.lee.service.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemController
 * @Author LS
 * @Description 类描述:
 * @Date 2018/9/27 14:56
 * @Version 1.0
 **/
@RestController
public class DemController {

    @Autowired
    private UserService userService;

    @GetMapping("/save")
    public String save(){
        User_C user=new User_C();
        user.setName("张天爱");
        user.setAdderss("北极光");
        userService.save(user);
        return "OK";
    }
}
