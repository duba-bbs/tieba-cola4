package com.tingyu.tieba.user.executor.query;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.cola.dto.MultiResponse;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListByNickNameQry;
import org.springframework.stereotype.Component;

@Component
public class UserListByNickNameQryExe{
    public MultiResponse<UserDTO> execute(UserListByNickNameQry cmd) {
        List<UserDTO> userDTOList = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setNickName("NormalNickName");
        userDTOList.add(userDTO);
        return MultiResponse.of(userDTOList);
    }
}
