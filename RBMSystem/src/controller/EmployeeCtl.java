package controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.util.Count;
import dao.AttendanceDao;
import dao.EmployeeDao;
import dao.tables.Attendance;
import dao.tables.Employee;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "empy")
public class EmployeeCtl {
    @Autowired
    UtilDao<Attendance> attendanceUDao;
    @Autowired
    UtilDao<Employee> employeeUDao;
    @Autowired
    AttendanceDao attendanceDao;
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("atdc")
    public @ResponseBody Integer atdc(Integer id, Integer type) {
        if(id == null || type == null)
            return 3;
        if (type == 1) {
            if(attendanceDao.getUnHomeByEmpId(id) != null)
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

}
