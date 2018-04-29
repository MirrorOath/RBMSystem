package controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.SystemUserDao;
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
    public @ResponseBody boolean signIn(String name, String password) {
        SystemUser obj = systemUserDao.getByName(name);
        if (obj == null)
            return false;
        if (password.equals(obj.getPassword())) {
            obj.setLoginTime(new Date());
            systemUserDao.update(obj.getId(), obj);
            return true;
        }
        return false;
    }

}
