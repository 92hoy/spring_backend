package com.spring_backend.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring_backend.dao.api.board.BoardMapper;

@Service
public class BoardService {
    @Autowired
    private BoardMapper mapper;

    public List<HashMap<String,Object>> getboard(){
        List<HashMap<String, Object>> ret_list = new ArrayList<HashMap<String, Object>>();
        ret_list = mapper.boardList();
        return ret_list;
    } 
    public int postboard(Map<String, Object> param){
        HashMap<String, Object> ret = new HashMap<String, Object>();
        ret.put("title",  param.get("title"));
        ret.put("context", param.get("context"));
        int ret_list = mapper.boardCreate(ret);
        return ret_list;
    } 
    public int deleteboard(Map<String, Object> param) {
        HashMap<String, Object> ret = new HashMap<String, Object>();
        ret.put("del_list",  param.get("id"));
        int ret_list = mapper.boardDelete(ret);
        return ret_list;
    }
    public int updateboard(Map<String, Object> param) {
        HashMap<String, Object> ret = new HashMap<String, Object>();
        ret.put("id",  param.get("id"));
        ret.put("title",  param.get("title"));
        ret.put("context",  param.get("context"));
        int ret_list = mapper.boardUpdate(ret);
        return ret_list;
    }
}