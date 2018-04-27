package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.Objects;
import dao.util.UtilFactory;

@Repository
public class ObjectsDao {
    
    public Objects update(Integer id, Objects newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Objects oldObj = (Objects) session.get(Objects.class, id);
        oldObj.setCount(newObj.getCount());
        oldObj.setLost(newObj.getLost());
        oldObj.setName(newObj.getName());
        oldObj.setOutCount(newObj.getOutCount());
        oldObj.setPrice(newObj.getPrice());

        tx.commit();
        session.close();
        return oldObj;
    }

}
