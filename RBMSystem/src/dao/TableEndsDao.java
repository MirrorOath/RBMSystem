package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.tables.TableEnds;
import dao.util.UtilFactory;

public class TableEndsDao {
    
    public TableEnds update(Integer id, TableEnds newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        TableEnds oldObj = (TableEnds) session.get(TableEnds.class, id);
        oldObj.setChangeMoney(newObj.getChangeMoney());
        oldObj.setConvertToRMB(newObj.getConvertToRMB());
        oldObj.setDate(newObj.getDate());
        oldObj.setNameOfCoin(newObj.getNameOfCoin());
        oldObj.setPayActually(newObj.getPayActually());
        oldObj.setPayeeId(newObj.getPayeeId());
        oldObj.setShouldPay(newObj.getShouldPay());
        oldObj.setStreamId(newObj.getStreamId());
        oldObj.setTypeOfCoin(newObj.getTypeOfCoin());

        tx.commit();
        session.close();
        return oldObj;
    }
    
}
