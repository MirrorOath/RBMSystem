package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.tables.Attendance;
import dao.util.UtilFactory;

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

}
