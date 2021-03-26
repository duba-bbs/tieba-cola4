package com.tingyu.tieba.test;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.api.BaServiceI;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.data.ErrorCode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * This is for integration test.
 *
 * Created by fulan.zjf on 2017/11/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaServiceTest {

    @Autowired
    private BaServiceI baService;


    @Before
    public void setUp() {

    }

    @Test
    public void testBaAddSuccess(){
        //1.prepare
        BaAddCmd baAddCmd = new BaAddCmd();
        BaDTO baDTO = new BaDTO();
        baDTO.setBaName("NormalName");
        baAddCmd.setBaDTO(baDTO);

        //2.execute
        Response response = baService.addBa(baAddCmd);

        //3.assert
        Assert.assertTrue(response.isSuccess());
    }

    @Test
    public void testBaAddCompanyNameConflict(){
        //1.prepare
        BaAddCmd baAddCmd = new BaAddCmd();
        BaDTO baDTO = new BaDTO();
        baDTO.setBaName("ConflictBaName");
        baAddCmd.setBaDTO(baDTO);

        //2.execute
        Response response = baService.addBa(baAddCmd);

        //3.assert error
        Assert.assertEquals(ErrorCode.B_BA_baNameConflict.getErrCode(), response.getErrCode());
    }
}
