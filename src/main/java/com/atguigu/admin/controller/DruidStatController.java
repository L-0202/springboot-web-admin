package com.atguigu.admin.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 获取druid的监控数据
 * */
//@Controller
public class DruidStatController {

    //@GetMapping("/druid")
    public Object druidStat(){
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}

