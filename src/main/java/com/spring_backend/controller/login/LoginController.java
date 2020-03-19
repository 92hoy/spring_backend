package com.spring_backend.controller.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.spring_backend.common.model.TestModel;
import com.spring_backend.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // 여기는 컨트롤러라고 알려주는 @RestController 어노테이션 사용
@RequestMapping("/api") // 여기로 들어올 path를 지정할 @RequestMapping 어노테이션 사용 localhost:8111/api
public class LoginController {

    @Autowired
    public TestService testService;

   
    @GetMapping("/login_chck")
    public List<HashMap<String, Object>> getList(TestModel testmodel) {
        List<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
        result = testService.testjava();
        return result;
    }

}
