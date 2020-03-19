package com.spring_backend.controller.user;

import com.spring_backend.common.model.UserModel;
import com.spring_backend.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
@Api(tags = {"1. User"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

    @Autowired
    public UserService userService;
 
    @ApiOperation(value = "회원 조회", notes = "모든 회원을 조회한다")
    @GetMapping(value = "/user")
    public List<HashMap<String, Object>> getList(UserModel usermodel) {
        List<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
        result = userService.getuser();
        return result;
    }
    // @ApiOperation(value = "회원 입력", notes = "회원을 입력한다.")
    // @PostMapping(value = "/user")
    // public User save(@ApiParam(value = "회원아이디", required = true) @RequestParam String uid,
    //                  @ApiParam(value = "회원이름", required = true) @RequestParam String name) {
    //     User user = User.builder()
    //             .uid(uid)
    //             .name(name)
    //             .build();
    //     return userJpaRepo.save(user);
    // }
}