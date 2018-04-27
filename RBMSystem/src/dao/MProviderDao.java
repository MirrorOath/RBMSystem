package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import dao.tables.MProvider;
import dao.util.UtilFactory;

@Repository
public class MProviderDao {
    
    public MProvider update(Integer id, MProvider newObj) {
        Session session = UtilFactory.getSession();
        Transaction tx = session.beginTransaction();

        MProvider oldObj = (MProvider) session.get(MProvider.class, id);
        oldObj.setAddress(newObj.getAddress());
        oldObj.setcMan(newObj.getcMan());
        oldObj.setcManMobile(newObj.getcManMobile());
        oldObj.setContractId(newObj.getContractId());
        oldObj.setFax(newObj.getFax());
        oldObj.setmName(newObj.getmName());
        oldObj.setName(newObj.getName());
        oldObj.setPhone(newObj.getPhone());

        tx.commit();
        session.close();
        return oldObj;
    }

}
