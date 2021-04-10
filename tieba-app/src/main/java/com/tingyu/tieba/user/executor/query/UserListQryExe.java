package com.tingyu.tieba.user.executor.query;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.cola.dto.PageResponse;
import com.github.pagehelper.PageHelper;
import com.tingyu.tieba.mappers.UserMapper;
import com.tingyu.tieba.user.converter.AppUserConverter;
import com.tingyu.tieba.user.dataobject.UserDO;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListQry;

import org.springframework.stereotype.Component;

@Component
public class UserListQryExe {

    @Resource
    private UserMapper userMapper;

    public PageResponse<UserDTO> execute(UserListQry qry) {
        PageHelper.startPage(qry.getPageIndex(), qry.getPageSize(), qry.getOrderBy());
        List<UserDO> userDOList = userMapper.list(AppUserConverter.toDataObject(qry));
        List<UserDTO> userDTOList = new ArrayList<>();
        userDOList.forEach(userDO -> {
            userDTOList.add(AppUserConverter.toClientObject(userDO));
        });
        if (!userDTOList.isEmpty()) {
            return PageResponse.of(userDTOList, userDTOList.size(), qry.getPageSize(), qry.getPageIndex());
        }
        return PageResponse.of(qry.getPageSize(), qry.getPageIndex());
    }
}
