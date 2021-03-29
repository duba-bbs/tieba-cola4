package com.tingyu.tieba.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.fastjson.JSON;
import com.tingyu.tieba.ba.api.BaServiceI;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.command.BaDeleteCmd;
import com.tingyu.tieba.ba.dto.command.BaUpdateCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaController {

    @Autowired
    private BaServiceI baService;

    @GetMapping(value = "/ba")
    public MultiResponse<BaDTO> listBa(BaListQry baListQry){
        return baService.list(baListQry);
    }

    @PostMapping(value = "/ba")
    public Response addBa(@RequestBody BaAddCmd baAddCmd){
        return baService.addBa(baAddCmd);
    }
    // @PostMapping(value = "/ba")
    // public Response addBa(@RequestBody String json){
    //     BaAddCmd baAddCmd = JSON.parseObject(json, BaAddCmd.class);
    //     return baService.addBa(baAddCmd);
    // }

    @DeleteMapping(value = "/ba")
    public Response deleteBa(BaDeleteCmd baDeleteCmd){
        return baService.deleteBa(baDeleteCmd);
    }

    @PutMapping(value = "/ba")
    public Response updateBa(@RequestBody BaUpdateCmd baUpdateCmd){
        return baService.updateBa(baUpdateCmd);
    }

    @PatchMapping(value = "/ba")
    public Response partialUpdateBa(@RequestBody BaUpdateCmd baUpdateCmd){
        return baService.partialUpdateBa(baUpdateCmd);
    }
}
