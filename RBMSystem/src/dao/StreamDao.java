package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.tables.Stream;
import dao.util.UtilFactory;

public class StreamDao {
    
    public Stream update(Integer id, Stream newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Stream oldObj = (Stream) session.get(Stream.class, id);
        oldObj.setPeopleCount(newObj.getPeopleCount());
        oldObj.setStreamId(newObj.getStreamId());
        oldObj.setTableId(newObj.getTableId());

        tx.commit();
        session.close();
        return oldObj;
    }

}
