package com.example.iptfinal.dao;

import com.example.iptfinal.entity.Buy;
import com.example.iptfinal.entity.Item;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ItemDAOImpl implements ItemDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Item> getItem() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from Item");
        List<Item> items= theQuery.list();
        return items;
    }

    @Override
    public void saveItem(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(item);
    }

    @Override
    public int getPriceItem(int id) {
        System.out.print(">>>>> "+id);
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from Item as item where item.id =:name");
        theQuery.setInteger("name",id);
        Item item = (Item) theQuery.uniqueResult();
        System.out.print(item.getPrice());
        return item.getPrice();
    }
}
