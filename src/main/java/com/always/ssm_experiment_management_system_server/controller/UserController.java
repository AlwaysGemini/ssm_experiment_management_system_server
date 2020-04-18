package com.always.ssm_experiment_management_system_server.controller;

import com.always.ssm_experiment_management_system_server.Response;
import com.always.ssm_experiment_management_system_server.mapper.UserMapper;
import com.always.ssm_experiment_management_system_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/user"})
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping(value = "/login")
    @ResponseBody
    public Response login(@RequestParam String user_account, @RequestParam String user_password) {
        User user = userMapper.findByAccountAndPassword(user_account, user_password);
        if (user != null) {
            return new Response(200, "登录成功", user);
        } else {
            return new Response(500, "登录失败", null);
        }
    }
}
