package com.spring_backend.controller.board;

import com.spring_backend.model.BoardModel;
import com.spring_backend.service.BoardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
 
@Api(tags = {"2.Board"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class BoardController {

    @Autowired
    public BoardService boardService;
 
    @ApiOperation(value = "게시판 조회", notes = "게시판을 조회한다")
    @GetMapping(value = "/get_board")
    public List<HashMap<String, Object>> getList(BoardModel boardmodel) {
        List<HashMap<String, Object>> result = new ArrayList<HashMap<String, Object>>();
        result = boardService.getboard();
        return result;
    }
    @ApiOperation(value = "게시글 생성", notes = "게시글 생성")
    @PostMapping(value = "/create_board")
    public void postList(HttpServletRequest request, BoardModel boardmodel, @RequestBody Map<String, Object> param) {
        boardService.postboard(param);
        // response.setData(result)
    }
    @ApiOperation(value = "게시글 삭제", notes = "게시글 삭제")
    @PutMapping(value = "/delete_board")
    public void deleteboard(HttpServletRequest request, BoardModel boardmodel, @RequestBody Map<String, Object> param) {
        boardService.deleteboard(param);
        // System.out.println(param);
    }
    @ApiOperation(value = "게시글 수정", notes = "게시글 수정")
    @PutMapping(value = "/update_board")
    public void updateboard(HttpServletRequest request, BoardModel boardmodel, @RequestBody Map<String, Object> param) {
        boardService.updateboard(param);
        // System.out.println(param);
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