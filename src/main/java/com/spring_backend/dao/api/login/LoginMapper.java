package com.spring_backend.dao.api.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    // public List<HashMap<String, String>> getTest(HashMap<String, Object> map);
    // public int get(Map<String, Object> map);

    // Map<String,Object> param = new HashMap<String,Object>();
    public List<HashMap<String, Object>> LoginCheck();

    // Integer param1 = 1;
    // public int getTest2(Integer param1);
    // List<Map<String, Object>> getTest();
}