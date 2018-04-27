package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.Orders;
import dao.util.UtilFactory;

@Repository
public class POrdersDao {
    public Orders update(Integer id, Orders newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Orders oldObj = (Orders) session.get(Orders.class, id);
        oldObj.setStreamNumber(newObj.getStreamNumber());
        oldObj.setDishType(newObj.getDishType());
        oldObj.setDishNumber(newObj.getDishNumber());
        oldObj.setDishName(newObj.getDishName());
        oldObj.setIsOrdered(newObj.getIsOrdered());
        oldObj.setIsGifts(newObj.getIsGifts());
        oldObj.setIsBack(newObj.getIsBack());
        oldObj.setPrice(newObj.getPrice());
        oldObj.setProducterId(newObj.getProducterId());

        tx.commit();
        session.close();
        return oldObj;
    }

}
