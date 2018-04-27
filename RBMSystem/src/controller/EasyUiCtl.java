package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import controller.util.Count;
import dao.*;
import dao.tables.*;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "easyUi")
public class EasyUiCtl {
    @Autowired
    UtilDao<Attendance> attendanceUDao;
    @Autowired
    UtilDao<BuyEvent> buyEventUDao;
    @Autowired
    UtilDao<DepleteEvent> depleteEventUDao;
    @Autowired
    UtilDao<Employee> employeeUDao;
    @Autowired
    UtilDao<Menu> menuUDao;
    @Autowired
    UtilDao<MProvider> mProviderUDao;
    @Autowired
    UtilDao<Objects> objectsUDao;
    @Autowired
    UtilDao<Orders> ordersUDao;
    @Autowired
    UtilDao<Staple> stapleUDao;
    @Autowired
    UtilDao<Stream> streamUDao;
    @Autowired
    UtilDao<SystemUser> systemUserUDao;
    @Autowired
    UtilDao<TableBeginDao> tableBeginUDao;
    @Autowired
    UtilDao<TableEndsDao> tableEndsUDao;
    @Autowired
    AttendanceDao attendanceDao;
    @Autowired
    BuyEventDao buyEventDao;
    @Autowired
    DepleteEventDao depleteEventDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    MenuDao menuDao;
    @Autowired
    MProviderDao mProviderDao;
    @Autowired
    ObjectsDao objectsDao;
    @Autowired
    OrdersDao ordersDao;
    @Autowired
    StapleDao stapleDao;
    @Autowired
    StreamDao streamDao;
    @Autowired
    SystemUserDao systemUserDao;
    @Autowired
    TableBeginDao tableBeginDao;
    @Autowired
    TableEndsDao tableEndsDao;

    @RequestMapping("easyUIGetAttendances")
    public @ResponseBody List<Attendance> easyUIGetAttendances() {
        List<Attendance> attendances = attendanceUDao.getAll("Attendance");
        return attendances;
    }

    @RequestMapping("easyUISaveAttendance")
    public @ResponseBody Attendance easyUISaveAttendance(Integer employeeId, String start, String end) {
        Attendance obj = new Attendance();
        obj.setEmployeeId(employeeId);
        obj.setStart(Count.stringToDate(start));
        obj.setEnd(Count.stringToDate(end));
        Attendance rt = attendanceUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateAttendance")
    public @ResponseBody Attendance easyUIUpdateAttendance(Integer id, Integer employeeId, String start, String end) {
        Attendance obj = new Attendance();
        obj.setEmployeeId(employeeId);
        obj.setStart(Count.stringToDate(start));
        obj.setEnd(Count.stringToDate(end));
        Attendance rt = attendanceDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelAttendance")
    public @ResponseBody boolean easyUIDelAttendance(Integer id) {
        attendanceUDao.del(attendanceUDao.getById("Attendance", id));
        return true;
    }

    @RequestMapping("easyUIGetBuyEvents")
    public @ResponseBody List<BuyEvent> easyUIGetBuyEvents() {
        List<BuyEvent> BuyEvents = buyEventUDao.getAll("BuyEvent");
        return BuyEvents;
    }

    @RequestMapping("easyUISaveBuyEvent")
    public @ResponseBody BuyEvent easyUISaveBuyEvent(Integer stapleId, Integer count, String date) {
        BuyEvent obj = new BuyEvent();
        obj.setStapleId(stapleId);
        obj.setCount(count);
        obj.setDate(Count.stringToDate(date));
        BuyEvent rt = buyEventUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateBuyEvent")
    public @ResponseBody BuyEvent easyUIUpdateBuyEvent(Integer id, Integer stapleId, Integer count, String date) {
        BuyEvent obj = new BuyEvent();
        obj.setStapleId(stapleId);
        obj.setCount(count);
        obj.setDate(Count.stringToDate(date));
        BuyEvent rt = buyEventDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelBuyEvent")
    public @ResponseBody boolean easyUIDelBuyEvent(Integer id) {
        buyEventUDao.del(buyEventUDao.getById("BuyEvent", id));
        return true;
    }

    @RequestMapping("easyUIGetDepleteEvents")
    public @ResponseBody List<DepleteEvent> easyUIGetDepleteEvents() {
        List<DepleteEvent> DepleteEvents = depleteEventUDao.getAll("DepleteEvent");
        return DepleteEvents;
    }

    @RequestMapping("easyUISaveDepleteEvent")
    public @ResponseBody DepleteEvent easyUISaveDepleteEvent(Integer stapleId, Integer count, String date) {
        DepleteEvent obj = new DepleteEvent();
        obj.setStapleId(stapleId);
        obj.setCount(count);
        obj.setDate(Count.stringToDate(date));
        DepleteEvent rt = depleteEventUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateDepleteEvent")
    public @ResponseBody DepleteEvent easyUIUpdateDepleteEvent(Integer id, Integer stapleId, Integer count, String date) {
        DepleteEvent obj = new DepleteEvent();
        obj.setStapleId(stapleId);
        obj.setCount(count);
        obj.setDate(Count.stringToDate(date));
        DepleteEvent rt = depleteEventDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelDepleteEvent")
    public @ResponseBody boolean easyUIDelDepleteEvent(Integer id) {
        depleteEventUDao.del(depleteEventUDao.getById("DepleteEvent", id));
        return true;
    }

    @RequestMapping("easyUIGetEmployees")
    public @ResponseBody List<Employee> easyUIGetEmployees() {
        List<Employee> Employees = employeeUDao.getAll("Employee");
        return Employees;
    }

    @RequestMapping("easyUISaveEmployee")
    public @ResponseBody Employee easyUISaveEmployee(Employee obj) {
        Employee rt = employeeUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateEmployee")
    public @ResponseBody Employee easyUIUpdateEmployee(Integer id, Employee obj) {
        Employee rt = employeeDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelEmployee")
    public @ResponseBody boolean easyUIDelEmployee(Integer id) {
        employeeUDao.del(employeeUDao.getById("Employee", id));
        return true;
    }

    @RequestMapping("easyUIGetMenus")
    public @ResponseBody List<Menu> easyUIGetMenus() {
        List<Menu> Menu = menuUDao.getAll("Menu");
        return Menu;
    }

    @RequestMapping("easyUISaveMenu")
    public @ResponseBody Menu easyUISaveMenu(Menu obj) {
        Menu rt = menuUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateMenu")
    public @ResponseBody Menu easyUIUpdateMenu(Integer id, Menu obj) {
        Menu rt = menuDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelMenu")
    public @ResponseBody boolean easyUIDelMenu(Integer id) {
        menuUDao.del(menuUDao.getById("Menu", id));
        return true;
    }

    @RequestMapping("easyUIGetMProviders")
    public @ResponseBody List<MProvider> easyUIGetMProviders() {
        List<MProvider> MProvider = mProviderUDao.getAll("MProvider");
        return MProvider;
    }

    @RequestMapping("easyUISaveMProvider")
    public @ResponseBody MProvider easyUISaveMProvider(MProvider obj) {
        MProvider rt = mProviderUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateMProvider")
    public @ResponseBody MProvider easyUIUpdateMProvider(Integer id, MProvider obj) {
        MProvider rt = mProviderDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelMProvider")
    public @ResponseBody boolean easyUIDelMProvider(Integer id) {
        mProviderUDao.del(mProviderUDao.getById("MProvider", id));
        return true;
    }

    @RequestMapping("easyUIGetObjectss")
    public @ResponseBody List<Objects> easyUIGetObjectss() {
        List<Objects> Objects = objectsUDao.getAll("Objects");
        return Objects;
    }

    @RequestMapping("easyUISaveObjects")
    public @ResponseBody Objects easyUISaveObjects(Objects obj) {
        Objects rt = objectsUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateObjects")
    public @ResponseBody Objects easyUIUpdateObjects(Integer id, Objects obj) {
        Objects rt = objectsDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelObjects")
    public @ResponseBody boolean easyUIDelObjects(Integer id) {
        objectsUDao.del(objectsUDao.getById("Objects", id));
        return true;
    }

    @RequestMapping("easyUIGetOrderss")
    public @ResponseBody List<Orders> easyUIGetOrderss() {
        List<Orders> Orders = ordersUDao.getAll("Orders");
        return Orders;
    }

    @RequestMapping("easyUISaveOrders")
    public @ResponseBody Orders easyUISaveOrders(Orders obj) {
        Orders rt = ordersUDao.save(obj);
        return rt;
    }

    @RequestMapping("easyUIUpdateOrders")
    public @ResponseBody Orders easyUIUpdateOrders(Integer id, Orders obj) {
        Orders rt = ordersDao.update(id, obj);
        return rt;
    }

    @RequestMapping("easyUIDelOrders")
    public @ResponseBody boolean easyUIDelOrders(Integer id) {
        ordersUDao.del(ordersUDao.getById("Orders", id));
        return true;
    }

}
