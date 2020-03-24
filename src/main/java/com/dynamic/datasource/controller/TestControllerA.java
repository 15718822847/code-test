package com.dynamic.datasource.controller;

import com.aop.model.OperationLog;
import com.aop.service.UserService;
import com.dynamic.datasource.model;
import com.dynamic.datasource.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private repository r;

    @ResponseBody
    @RequestMapping("/portal")
    public List<OperationLog> findUserNameByTel(){
        return r.portal();
    }

    @ResponseBody
    @RequestMapping("/portal")
    public List<model> findUserNameByTel(@RequestParam("tel") String tel){
        return r.psrm();
    }
}
