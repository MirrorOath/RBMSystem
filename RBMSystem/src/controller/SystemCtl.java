package controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.SystemUserDao;
import dao.tables.Employee;
import dao.tables.SystemUser;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "system")
public class SystemCtl {
    @Autowired
    UtilDao<SystemUser> systemUserUDao;
    @Autowired
    SystemUserDao systemUserDao;

    @RequestMapping("signIn")
    public @ResponseBody boolean signIn(HttpSession session, String name, String password) {
        SystemUser obj = systemUserDao.getByName(name);
        if (obj == null)
            return false;
        if (password.equals(obj.getPassword())) {
            obj.setLoginTime(new Date());
            systemUserDao.update(obj.getId(), obj);
            session.setAttribute("userInfo", obj);
            return true;
        }
        return false;
    }
    
    @RequestMapping("getUser")
    public @ResponseBody SystemUser getUser(HttpSession session) {
        SystemUser admin = (SystemUser) session.getAttribute("admin");
        Employee userInfo = (Employee) session.getAttribute("userInfo");
        if(userInfo != null) {
            admin = new SystemUser();
            admin.setName(userInfo.getName());
            admin.setSuccess(true);
            return admin;
        }
        else if (admin != null) {
            admin.setSuccess(true);
            return admin;
        }
        else {
            admin = new SystemUser();
            admin.setSuccess(false);
            return admin;
        }
    }
    

}
