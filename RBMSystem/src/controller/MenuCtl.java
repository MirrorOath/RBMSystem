package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.MenuDao;
import dao.tables.Menu;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "menu")
public class MenuCtl {
    @Autowired
    UtilDao<Menu> menuUDao;
    @Autowired
    MenuDao menuDao;

    @RequestMapping("getMenuInfo")
    public @ResponseBody Menu getMenuInfo(Integer menuId) {
        Menu obj = menuUDao.getById("Menu", menuId);
        if(obj == null) {
            obj = new Menu();
            obj.setSuccess(false);
        }
        else
            obj.setSuccess(true);
        System.out.println(obj.toString());
        return obj;
    }
}
