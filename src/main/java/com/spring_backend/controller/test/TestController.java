package com.spring_backend.controller.test;

import com.spring_backend.common.model.TestModel;

import org.springframework.web.bind.annotation.*;

@RestController // 여기는 컨트롤러라고 알려주는 @RestController 어노테이션 사용
@RequestMapping("/api") // 여기로 들어올 path를 지정할 @RequestMapping 어노테이션 사용 localhost:8111/api
public class TestController {

    // -----------------------------GET----------------------------------
    @RequestMapping(method = RequestMethod.GET, path = "/getRequest")   // localhost:8111/api/getRequest
    public String getRequest(){
        return "this is getRequest";
    }
    // GetMapping은 RequestMapping과는 다르게 메소드유형 없이 주소만 지정해주면된다.
    @GetMapping("/getParameters")  // localhost:8111/api/getParameters?id=shlee0882&email=shlee0882@gmail.com
    public String getParameters(@RequestParam String id, @RequestParam String email){
        return "아이디는 "+id+" 이메일은 "+email;
    }
    
    @GetMapping("/getMultiParameters")
    public String getMultiParameters(TestModel testmodel) {
        return "MODEL 사용 아이디는 "+testmodel.getId()+" 이메일은 "+testmodel.getName();
    }

    @GetMapping("/getMultiParametersRtnJson")
    public TestModel getMultiParametersRtnJson(TestModel testmodel) {
        return testmodel;
    }

    // -----------------------------POST----------------------------------
    // http통신할때 post는 body에다 data를 집어넣어서 받아오겠다.
    // @RequestBody에 SearchVO에 있는 값을 매칭해서 보내줘라.
    
    @RequestMapping(method = RequestMethod.POST, path = "/postRequest")
    public TestModel postRequest(@RequestBody TestModel testModel){
        return testModel;
    }
 
    @PostMapping(value = "/postMapping")
    public TestModel postMapping(@RequestBody TestModel testModel){
        return testModel;
    }


}

