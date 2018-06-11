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
public class BuyItemDAOImpl implements BuyItemDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Buy> getBuy() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from Buy");
        List<Buy> buys= theQuery.list();
        return buys;
    }

    @Override
    public void saveBuy(Buy buy) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(buy);
    }
}
