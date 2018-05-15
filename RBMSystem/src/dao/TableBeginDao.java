package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import controller.util.Count;
import dao.tables.TableBegin;
import dao.util.UtilFactory;

@Repository
public class TableBeginDao {
    
    public TableBegin update(Integer id, TableBegin newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        TableBegin oldObj = (TableBegin) session.get(TableBegin.class, id);
        oldObj.setDate(newObj.getDate());
        oldObj.setStreamId(newObj.getStreamId());
        oldObj.setWaiterId(newObj.getWaiterId());

        tx.commit();
        session.close();
        return oldObj;
    }
    
    @SuppressWarnings("unchecked")
    public List<TableBegin> getOneDao(String date){
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();
        
        Date start = Count.stringToDate(date);
        start.setHours(0);
        start.setMinutes(0);
        start.setSeconds(0);
        Date end = new Date();
        end.setYear(start.getYear());
        end.setMonth(start.getMonth());
        end.setDate(start.getDate());
        end.setHours(23);
        end.setMinutes(59);
        end.setSeconds(59);
        Query query = session.createQuery("FROM TableBegin WHERE date > ? AND date <= ?");
        query.setString(0, Count.getStringDate(start));
        query.setString(1, Count.getStringDate(end));
        System.out.println(Count.getStringDate(start) + "---" + Count.getStringDate(end));
        List<TableBegin> objs = query.list();

        tx.commit();
        session.close();
        return objs;
    }
    
}
