package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.ObjectsDao;
import dao.tables.Objects;
import dao.util.UtilDao;

@Controller
@RequestMapping(value = "front")
public class FrontOfficeCtl {
    @Autowired
    UtilDao<Objects> objectsUDao;
    @Autowired
    ObjectsDao objectsDao;
    

    @RequestMapping("itemIO")
    public @ResponseBody Integer itemIO(Integer id, Integer count, Integer type) {
        if(id == null || count == null || type == null)
            return -1;
        Objects obj = objectsUDao.getById("Objects", id);
        if(obj == null)
            return -2;
        if(type == 1)
            obj.setCount(obj.getCount() + count);
        else if(type == 2) {
            if(obj.getCount() < count)
                return -3;
            obj.setCount(obj.getCount() - count);
            obj.setOutCount(obj.getOutCount() + count);
        }
        objectsDao.update(id, obj);
        return 0;
    }

}
