package com.tingyu.tieba.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.api.BaServiceI;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListByNameQry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaController {

    @Autowired
    private BaServiceI baService;

    @GetMapping(value = "/ba")
    public MultiResponse<BaDTO> listBaByName(@RequestParam(required = false) String name){
        BaListByNameQry baListByNameQry = new BaListByNameQry();
        baListByNameQry.setName(name);
        return baService.listByName(baListByNameQry);
    }

    @PostMapping(value = "/ba")
    public Response addBa(@RequestBody BaAddCmd baAddCmd){
        return baService.addBa(baAddCmd);
    }
}
