package com.spring_backend.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_backend.dao.api.login.LoginMapper;

@Service
public class LoginService {
    @Autowired
    private LoginMapper mapper;

    public List<HashMap<String,Object>> logincheck(){
        List<HashMap<String, Object>> ret_list = new ArrayList<HashMap<String, Object>>();
        ret_list = mapper.LoginCheck();
        return ret_list;
    }

    
 
}