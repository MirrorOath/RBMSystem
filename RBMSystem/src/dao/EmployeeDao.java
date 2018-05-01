package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.Employee;
import dao.util.UtilFactory;

@Repository
public class EmployeeDao {
    
    public Employee update(Integer id, Employee newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Employee oldObj = (Employee) session.get(Employee.class, id);
        oldObj.setDutyType(newObj.getDutyType());
        oldObj.setIsWork(newObj.getIsWork());
        oldObj.setName(newObj.getName());

        tx.commit();
        session.close();
        return oldObj;
    }
    
    public Employee getByName(String name) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("from Employee where name = ?");
        query.setString(0, name);
        Employee obj = (Employee) query.uniqueResult();

        tx.commit();
        session.close();
        return obj;
    }

}
