package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             @RequestParam(value = "pn",defaultValue = "1") Integer pn,
                             RedirectAttributes redirectAttributes){

        userService.removeById(id);

        redirectAttributes.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("张三", "112233"),
//                new User("李四", "123444"),
//                new User("蔡徐坤", "123456"),
//                new User("lihua", "123321"));
//        model.addAttribute("users",users);

        //从数据库中查出user表中的数据

        List<User> list = userService.list();

        model.addAttribute("users",list);

        //分页查询对象
        Page<User> userPage = new Page<>(pn, 2);

        //分页查询的结果
        Page<User> page = userService.page(userPage, null);

        //当前第几页
        long current = page.getCurrent();
        //总计多少页
        long pages = page.getPages();
        //总记录数
        long total = page.getTotal();

        List<User> records = page.getRecords();

        model.addAttribute("page",page);

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
