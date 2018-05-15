package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.util.Count;
import dao.POrdersDao;
import dao.TableBeginDao;
import dao.tables.Employee;
import dao.tables.Orders;
import dao.tables.SystemUser;
import dao.tables.TableBegin;
import dao.util.UtilFactory;

@Controller
@RequestMapping(value = "/special/")
public class SpecialCtl {
    @Autowired
    TableBeginDao tableBeginDao;
    @Autowired
    POrdersDao ordersDao;

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
    
    Date stringToDateNoHMS(String str) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    @RequestMapping("forDateOrders")
    public @ResponseBody List<Orders> forDateOrders(String date) {
        System.out.println(date);
        Date ddate = stringToDateNoHMS(date);
        List<TableBegin> bgs = tableBeginDao.getOneDao(Count.getStringDate(ddate));
        List<Orders> ods = new ArrayList<Orders>();
        for(TableBegin g : bgs) {
            ods.addAll(ordersDao.getBystId(g.getStreamId()));
        }
        return ods;
    }
    
}
