package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.DepleteEvent;
import dao.util.UtilFactory;

@Repository
public class DepleteEventDao {
    
    public DepleteEvent update(Integer id, DepleteEvent newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        DepleteEvent oldObj = (DepleteEvent) session.get(DepleteEvent.class, id);
        oldObj.setCount(newObj.getCount());
        oldObj.setDate(newObj.getDate());
        oldObj.setStapleId(newObj.getStapleId());

        tx.commit();
        session.close();
        return oldObj;
    }

}
