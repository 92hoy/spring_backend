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

    
 
}