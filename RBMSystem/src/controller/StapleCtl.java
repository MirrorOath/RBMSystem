package controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.BuyEventDao;
import dao.DepleteEventDao;
import dao.StapleDao;
import dao.tables.BuyEvent;
import dao.tables.DepleteEvent;
import dao.tables.Staple;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "staple")
public class StapleCtl {
    @Autowired
    UtilDao<BuyEvent> buyEventUDao;
    @Autowired
    UtilDao<DepleteEvent> depleteEventUDao;
    @Autowired
    UtilDao<Staple> stapleUDao;
    @Autowired
    BuyEventDao buyEventDao;
    @Autowired
    DepleteEventDao depleteEventDao;
    @Autowired
    StapleDao stapleDao;

    @RequestMapping("stapleIO")
    public @ResponseBody Integer stapleIO(Integer id, Integer count, Integer type) {
        Staple staple = stapleUDao.getById("Staple", id);
        if (staple == null)
            return -2;
        if (type == 1) {
            staple.setLast(staple.getLast() + count);
            stapleDao.update(staple.getId(), staple);
            BuyEvent obj = new BuyEvent();
            obj.setCount(count);
            obj.setDate(new Date());
            obj.setStapleId(id);
            buyEventUDao.save(obj);
        } else if (type == 2) {
            if(staple.getLast() < count)
                return -3;
            staple.setLast(staple.getLast() - count);
            stapleDao.update(staple.getId(), staple);
            DepleteEvent obj = new DepleteEvent();
            obj.setCount(count);
            obj.setDate(new Date());
            obj.setStapleId(id);
            depleteEventUDao.save(obj);
        } else
            return -1;
        return 0;
    }

}
