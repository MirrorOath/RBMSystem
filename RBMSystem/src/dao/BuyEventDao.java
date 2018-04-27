package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.tables.BuyEvent;
import dao.util.UtilFactory;

public class BuyEventDao {
    
    public BuyEvent update(Integer id, BuyEvent newBuyEvent) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        BuyEvent oldObj = (BuyEvent) session.get(BuyEvent.class, id);
        oldObj.setCount(newBuyEvent.getCount());
        oldObj.setDate(newBuyEvent.getDate());
        oldObj.setStapleId(newBuyEvent.getStapleId());

        tx.commit();
        session.close();
        return oldObj;
    }
}
