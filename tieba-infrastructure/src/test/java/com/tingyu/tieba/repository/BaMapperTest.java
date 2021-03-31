package com.tingyu.tieba.repository;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.mappers.BaMapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaMapperTest {

    SqlSession sqlSession;
    BaMapper baMapper;

    @Before
    public void before() {
        sqlSession = Mybatis3Utils.getCurrentSqlSession();
        baMapper = sqlSession.getMapper(BaMapper.class);
    }

    @After
    public void after() {
        Mybatis3Utils.closeCurrentSession();
    }

    @Test
    public void insert() {
        BaDO baDO = new BaDO();
        baDO.setParentId(BigInteger.valueOf(0));
        baDO.setBaName("tian");
        baDO.setLevel("1");
        baDO.setCreator("Frank");
        baDO.setModifier("Frank");
        baDO.setDescription("Frank");
        baDO.setCreateTime(LocalDateTime.now());
        baDO.setModifyTime(LocalDateTime.now());
        baDO.setStatus("0");
        baDO.setRemark("Frank");

        baMapper.create(baDO);
        sqlSession.commit();
    }
}
