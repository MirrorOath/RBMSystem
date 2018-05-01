package controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.util.Count;
import dao.AttendanceDao;
import dao.EmployeeDao;
import dao.SystemUserDao;
import dao.tables.Attendance;
import dao.tables.Employee;
import dao.tables.SystemUser;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "empy")
public class EmployeeCtl {
    @Autowired
    UtilDao<Attendance> attendanceUDao;
    @Autowired
    UtilDao<Employee> employeeUDao;
    @Autowired
    UtilDao<SystemUser> systemUserUDao;
    @Autowired
    AttendanceDao attendanceDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SystemUserDao systemUserDao;

    @RequestMapping("atdc")
    public @ResponseBody Integer atdc(Integer id, Integer type) {
        if (id == null || type == null)
            return 3;
        if (type == 1) {
            if (attendanceDao.getUnHomeByEmpId(id) != null)
                return 1;
            Attendance obj = new Attendance();
            obj.setEmployeeId(id);
            obj.setStart(new Date());
            obj.setEnd(Count.stringToDate("1970-01-01 00:00:00"));
            attendanceUDao.save(obj);
            return 0;
        }
        if (type == 2) {
            Attendance obj = attendanceDao.getUnHomeByEmpId(id);
            if (obj == null)
                return 2;
            obj.setEnd(new Date());
            attendanceDao.update(obj.getId(), obj);
        }
        return 0;
    }

    @RequestMapping("signUp")
    public @ResponseBody Integer signUp(String name, String password) {
        if (employeeDao.getByName(name) != null)
            return -1;
        Employee obj = new Employee();
        obj.setName(name);
        obj.setPassword(password);
        employeeUDao.save(obj);
        return 0;
    }

    @RequestMapping("signIn")
    public @ResponseBody Integer signIn(HttpSession session, String name, String password, String type) {
        if ("管理员".equals(type)) {
            SystemUser obj = systemUserDao.getByName(name);
            if (obj == null)
                return -1;
            if (password.equals(obj.getPassword())) {
                session.setAttribute("admin", obj);
                return 0;
            }
            return -2;
        } else{
            Employee obj = employeeDao.getByName(name);
            if (obj == null)
                return -1;
            if (password.equals(obj.getPassword())) {
                session.setAttribute("userInfo", obj);
                return 1;
            }
            return -2;
        }
    }

}
