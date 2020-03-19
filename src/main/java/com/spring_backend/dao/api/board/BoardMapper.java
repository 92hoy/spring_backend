package com.spring_backend.dao.api.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    // public List<HashMap<String, String>> getTest(HashMap<String, Object> map);
    // public int get(Map<String, Object> map);

    // Map<String,Object> param = new HashMap<String,Object>();
    public List<HashMap<String, Object>> boardList();

    // Integer param1 = 1;
    // public int getTest2(Integer param1);
    // List<Map<String, Object>> getTest();
}