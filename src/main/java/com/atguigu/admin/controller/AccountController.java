package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @GetMapping  ("/acc")
    public Account getById(Integer id){

        return accountService.getAccById(id);
    }
}
