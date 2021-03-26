package com.tingyu.tieba.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.tie.api.TieServiceI;
import com.tingyu.tieba.tie.dto.command.TieAddCmd;
import com.tingyu.tieba.tie.dto.data.TieDTO;
import com.tingyu.tieba.tie.dto.query.TieListByTitleQry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TieController {

    @Autowired
    private TieServiceI tieService;

    @GetMapping(value = "/tie")
    public MultiResponse<TieDTO> listTieByTitle(@RequestParam(required = false) String title){
        TieListByTitleQry tieListByTitleQry = new TieListByTitleQry();
        tieListByTitleQry.setTitle(title);
        return tieService.listByTitle(tieListByTitleQry);
    }

    @PostMapping(value = "/tie")
    public Response addTie(@RequestBody TieAddCmd tieAddCmd){
        return tieService.addTie(tieAddCmd);
    }
}
