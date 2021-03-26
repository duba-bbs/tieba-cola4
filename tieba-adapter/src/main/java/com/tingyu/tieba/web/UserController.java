package com.tingyu.tieba.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.api.UserServiceI;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListByNickNameQry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceI userService;

    @GetMapping(value = "/user")
    public MultiResponse<UserDTO> listUserByNickName(@RequestParam(required = false) String nickName){
        UserListByNickNameQry userListByNickNameQry = new UserListByNickNameQry();
        userListByNickNameQry.setNickName(nickName);
        return userService.listByNickName(userListByNickNameQry);
    }

    @PostMapping(value = "/user")
    public Response addUser(@RequestBody UserAddCmd userAddCmd){
        return userService.addUser(userAddCmd);
    }
}
