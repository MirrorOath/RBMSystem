package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.tables.Staple;
import dao.util.UtilFactory;

public class StapleDao {
    
    public Staple update(Integer id, Staple newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        Staple oldObj = (Staple) session.get(Staple.class, id);
        oldObj.setBuyUnit(newObj.getBuyUnit());
        oldObj.setDepleteUnit(newObj.getDepleteUnit());
        oldObj.setDishId(newObj.getDishId());
        oldObj.setLast(newObj.getLast());
        oldObj.setPrice(newObj.getPrice());
        oldObj.setProviderId(newObj.getProviderId());
        oldObj.setRawMBrand(newObj.getRawMBrand());
        oldObj.setRawMName(newObj.getRawMName());
        oldObj.setRawMOrigin(newObj.getRawMOrigin());
        oldObj.setRawMType(newObj.getRawMType());
        oldObj.setSpecs(newObj.getSpecs());

        tx.commit();
        session.close();
        return oldObj;
    }

}
