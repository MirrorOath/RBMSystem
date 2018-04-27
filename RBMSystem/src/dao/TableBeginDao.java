package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.tables.TableBegin;
import dao.util.UtilFactory;

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

}
