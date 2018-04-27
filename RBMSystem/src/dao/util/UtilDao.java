package dao.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UtilDao<T> {

    public T save(T t) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        session.save(t);

        tx.commit();
        session.close();
        return t;
    }
    
    public void del(T t) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        session.delete(t);

        tx.commit();
        session.close();
    }
    
    @SuppressWarnings("unchecked")
    public T getById(String tableName, Integer id) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("from ? where id = ?");
        query.setString(0, tableName);
        query.setString(1, id.toString());
        T t = (T) query.uniqueResult();
        
        tx.commit();
        session.close();
        return t;
    }
    
    @SuppressWarnings("unchecked")
    public List<T> getAll(String tableName){
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("from ?");
        query.setString(0, tableName);
        List<T> ts = (List<T>) query.list();
        
        tx.commit();
        session.close();
        return ts;
    }

}
