package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import controller.util.Count;
import dao.tables.Attendance;
import dao.util.UtilFactory;

@Repository
public class AttendanceDao {

    public Attendance update(Integer id, Attendance newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Attendance oldObj = (Attendance) session.get(Attendance.class, id);
        oldObj.setEmployeeId(newObj.getEmployeeId());
        oldObj.setStart(newObj.getStart());
        oldObj.setEnd(newObj.getEnd());

        tx.commit();
        session.close();
        return oldObj;
    }

    public Attendance getUnHomeByEmpId(Integer empId) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Date date = new Date();
        date.setTime(date.getTime() - (24 * 3600 * 1000));
        Date unHomeDate = Count.stringToDate("1970-01-01 00:00:00");
        Query query = session.createQuery("FROM Attendance WHERE employeeId = ? and startTime > ? and endTime = ?");
        query.setString(0, "1");
        query.setString(1, Count.getStringDate(date));
        query.setString(2, Count.getStringDate(unHomeDate));
        System.out.println(Count.getStringDate(date) + "--" + empId + "--" + Count.getStringDate(unHomeDate));
        Attendance obj = (Attendance) query.uniqueResult();

        tx.commit();
        session.close();
        return obj;
    }
    
    public List<Attendance> getAtdcByEmpId(Integer empId){
        return null;
    }

}
