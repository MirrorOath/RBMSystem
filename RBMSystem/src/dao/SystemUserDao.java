package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.SystemUser;
import dao.util.UtilFactory;

@Repository
public class SystemUserDao {

    public SystemUser update(Integer id, SystemUser newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        SystemUser oldObj = (SystemUser) session.get(SystemUser.class, id);
        oldObj.setAut(newObj.getAut());
        oldObj.setLoginTime(newObj.getLoginTime());
        oldObj.setName(newObj.getName());
        oldObj.setPassword(newObj.getPassword());

        tx.commit();
        session.close();
        return oldObj;
    }

    public SystemUser getByName(String name) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("from SystemUser where name = ?");
        query.setString(0, name);
        SystemUser obj = (SystemUser) query.uniqueResult();

        tx.commit();
        session.close();
        return obj;
    }

}
