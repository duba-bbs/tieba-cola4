package com.tingyu.tieba.web;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.api.UserServiceI;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import com.tingyu.tieba.user.dto.command.UserDeleteCmd;
import com.tingyu.tieba.user.dto.command.UserUpdateCmd;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListQry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceI userService;

    @GetMapping(value = "/user")
    public PageResponse<UserDTO> listUser(UserListQry userListQry) {
        return userService.list(userListQry);
    }

    @PostMapping(value = "/user")
    public Response addUser(@RequestBody UserAddCmd userAddCmd) {
        return userService.addUser(userAddCmd);
    }

    @DeleteMapping(value = "/user")
    public Response deleteUser(UserDeleteCmd userDeleteCmd) {
        return userService.deleteUser(userDeleteCmd);
    }

    @PutMapping(value = "/user")
    public Response updateUser(@RequestBody UserUpdateCmd userUpdateCmd) {
        return userService.updateUser(userUpdateCmd);
    }

    @PatchMapping(value = "/user")
    public Response partialUpdateUser(@RequestBody UserUpdateCmd userUpdateCmd) {
        return userService.partialUpdateUser(userUpdateCmd);
    }
}
