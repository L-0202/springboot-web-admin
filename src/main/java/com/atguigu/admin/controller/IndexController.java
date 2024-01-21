package com.atguigu.admin.controller;


import com.atguigu.admin.bean.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.util.StringUtils;

@Controller
public class IndexController {

    //登录页

    @GetMapping(value = {"/","login"})
    public String loginPage(){
        return "login";
    }



    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){

        if (StringUtils.hasLength(user.getUsername()) && "123456".equals(user.getPassword()) && StringUtils.hasLength(user.getPassword())){
            //把登录成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登陆成功，重定向到main.html,防止表单重复提交的最好方式
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误！");
            //回到登录页
            return "login";
        }
    }

    //去main页面
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){

//        //是否登录  拦截器 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null){
//            return "main";
//        }else {
//            //回到登录页
//            model.addAttribute("msg","未登录！");
//            return "login";
//        }
        return "main";
    }
}
