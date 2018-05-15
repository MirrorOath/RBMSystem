package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import controller.util.Count;
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
        oldObj.setDiscount(newObj.getDiscount());
        oldObj.setProducterId(newObj.getProducterId());

        tx.commit();
        session.close();
        return oldObj;
    }

    @SuppressWarnings("unchecked")
    public List<Orders> getBystId(Integer id){
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();
        
        Query query = session.createQuery("FROM Orders WHERE streamNumber = ?");
        query.setString(0, id.toString());
        List<Orders> objs = query.list();
        
        tx.commit();
        session.close();
        return objs;
    }

}
