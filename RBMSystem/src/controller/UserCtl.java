package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.tables.SystemUser;

@Controller
@RequestMapping(value = "/user/")
public class UserCtl {

    @RequestMapping("signIn")
    public String signIn(Model model, HttpSession session, SystemUser userInfo) {
        return "redirect:../index.html";
    }
}
