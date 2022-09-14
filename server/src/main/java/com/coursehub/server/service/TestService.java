package com.coursehub.server.service;

import com.coursehub.server.domain.Test;

import com.coursehub.server.domain.TestExample;
import com.coursehub.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo(1);
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
    }
}
