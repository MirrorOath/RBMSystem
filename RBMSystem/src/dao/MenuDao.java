package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.Menu;
import dao.util.UtilFactory;

@Repository
public class MenuDao {
    
    public Menu update(Integer id, Menu newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Menu oldObj = (Menu) session.get(Menu.class, id);
        oldObj.setDiscount(newObj.getDiscount());
        oldObj.setName(newObj.getName());
        oldObj.setNote(newObj.getNote());
        oldObj.setPrice(newObj.getPrice());
        oldObj.setSpecs(newObj.getSpecs());
        oldObj.setType(newObj.getType());

        tx.commit();
        session.close();
        return oldObj;
    }

}
