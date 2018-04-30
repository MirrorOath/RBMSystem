package controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.ObjectsDao;
import dao.POrdersDao;
import dao.StreamDao;
import dao.SystemUserDao;
import dao.TableBeginDao;
import dao.TableEndsDao;
import dao.tables.Objects;
import dao.tables.Orders;
import dao.tables.Stream;
import dao.tables.SystemUser;
import dao.tables.TableBegin;
import dao.tables.TableEnds;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "front")
public class FrontOfficeCtl {
    @Autowired
    UtilDao<Objects> objectsUDao;
    @Autowired
    UtilDao<Stream> streamUDao;
    @Autowired
    UtilDao<SystemUser> systemUserUDao;
    @Autowired
    UtilDao<TableBegin> tableBeginUDao;
    @Autowired
    UtilDao<TableEnds> tableEndsUDao;
    @Autowired
    UtilDao<Orders> ordersUDao;
    @Autowired
    ObjectsDao objectsDao;
    @Autowired
    StreamDao streamDao;
    @Autowired
    SystemUserDao systemUserDao;
    @Autowired
    TableBeginDao tableBeginDao;
    @Autowired
    TableEndsDao tableEndsDao;
    @Autowired
    POrdersDao ordersDao;

    @RequestMapping("itemIO")
    public @ResponseBody Integer itemIO(Integer id, Integer count, Integer type) {
        if (id == null || count == null || type == null)
            return -1;
        Objects obj = objectsUDao.getById("Objects", id);
        if (obj == null)
            return -2;
        if (type == 1)
            obj.setCount(obj.getCount() + count);
        else if (type == 2) {
            if (obj.getCount() < count)
                return -3;
            obj.setCount(obj.getCount() - count);
            obj.setOutCount(obj.getOutCount() + count);
        }
        objectsDao.update(obj.getId(), obj);
        return 0;
    }

    @RequestMapping("beginTable")
    public @ResponseBody TableBegin beginTable(Integer tableId, Integer waiterId, Integer dishNumber) {
        TableBegin tableBegin = new TableBegin();
        if(tableId == null || waiterId == null || dishNumber == null) {
            tableBegin.setStatus(-1);
            return tableBegin;
        }
        if(systemUserUDao.getById("SystemUser", waiterId) == null) {
            tableBegin.setStatus(-2);
            return tableBegin;
        }
        Stream stream = new Stream();
        stream.setPeopleCount(dishNumber);
        stream.setTableId(tableId);
        stream.setStreamId(null);
        stream = streamUDao.save(stream);
        Integer streamId = stream.getId();
        tableBegin.setDate(new Date());
        tableBegin.setStreamId(streamId);
        tableBegin.setWaiterId(waiterId);
        tableBeginUDao.save(tableBegin);
        tableBegin.setStatus(0);
        return tableBegin;
    }
    
    @RequestMapping("pleaseOrder")
    public @ResponseBody boolean pleaseOrder(Orders obj) {
        ordersUDao.save(obj);
        return true;
    }
    

    @RequestMapping("endTable")
    public @ResponseBody TableEnds endTable(Integer streamId, String typeOfCoin,
            String nameOfCoin, Double shouldPay, Double payActually, Double changeMoney,
            Integer payeeId) {
        TableEnds obj = new TableEnds();
        obj.setStreamId(streamId);
        obj.setDate(new Date());
        obj.setTypeOfCoin(typeOfCoin);
        obj.setNameOfCoin(nameOfCoin);
        obj.setShouldPay(shouldPay);
        obj.setPayActually(payActually);
        Double cc = 0.0;
        if("美元".equals(nameOfCoin))
            cc = 6.6;
        else if("日元".equals(nameOfCoin))
            cc = 0.16;
        else if("欧元".equals(nameOfCoin))
            cc = 10.0;
        else if("人名币".equals(nameOfCoin))
            cc = 1.0;
        obj.setConvertToRMB(cc * payActually);
        obj.setChangeMoney(changeMoney);
        obj.setPayeeId(payeeId);
        tableEndsUDao.save(obj);
        return obj;
    }

}
