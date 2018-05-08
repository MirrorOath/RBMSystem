package controller;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.tables.Employee;
import dao.tables.SystemUser;
import dao.util.UtilFactory;

@Controller
@RequestMapping(value = "/special/")
public class SpecialCtl {

    @RequestMapping("conBase")
    public @ResponseBody void conBase() {
        Session session = UtilFactory.getSession();
        session.close();
//        System.out.println("conBase");
    }
    

    @RequestMapping("signOut")
    public @ResponseBody void signOut(HttpSession session) {
        session.removeAttribute("admin");
        session.removeAttribute("userInfo");
    }
    
    @RequestMapping("isPassAUT")
    public @ResponseBody boolean isPassAUT(HttpSession session, String pathname) {
        System.out.println("pathname :: " + pathname);
        if("/RBMSystem/index/index.html".equals(pathname))
            return true;
        SystemUser admin = (SystemUser) session.getAttribute("admin");
        if(admin != null)
            return true;
        Employee epye = (Employee) session.getAttribute("userInfo");
        if(epye == null)
            return false;
        if("/RBMSystem/frontOfficeMmt/mealMmt.html".equals(pathname) &&
                "收款员".equals(epye.getDutyType()))
            return true;
        if(("/RBMSystem/frontOfficeMmt/mealStsts.html".equals(pathname)
                || "/RBMSystem/menuMmt/recipeSettings.html".equals(pathname)
                || "/RBMSystem/menuMmt/recipePrint.html".equals(pathname)
                ) &&
                "大堂经理".equals(epye.getDutyType()))
            return true;
        if(("/RBMSystem/stapleMmt/stapleMmt.html".equals(pathname)
                || "/RBMSystem/stapleMmt/stapleView.html".equals(pathname))
                &&
                "原料管理员".equals(epye.getDutyType()))
            return true;
        if(("/RBMSystem/employeeMmt/employeeAttendance.html".equals(pathname)
                || "/RBMSystem/employeeMmt/employeeSettings.html".equals(pathname))
                &&
                "人事经理".equals(epye.getDutyType()))
            return true;
        System.out.println(epye.getDutyType());
        return false;
    }
}
