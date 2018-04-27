package dao;

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
        oldObj.setAUT(newObj.getAUT());
        oldObj.setLoginTime(newObj.getLoginTime());
        oldObj.setName(newObj.getName());
        oldObj.setPassword(newObj.getPassword());

        tx.commit();
        session.close();
        return oldObj;
    }

}
