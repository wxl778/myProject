package com.dreamer.controller;

import com.dreamer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/user")
public class IUserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(path = "/lookall")
    public String findAll(){
        System.out.println("controller ...");
        System.out.println(iUserService.findAll());
        return "success";
    }
}
