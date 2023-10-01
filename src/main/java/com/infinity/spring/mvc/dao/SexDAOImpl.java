
package com.infinity.spring.mvc.dao;

import com.infinity.spring.mvc.entity.Sex;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SexDAOImpl implements SexDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    @Transactional
    public List<Sex> getAllSex() {
        
        
        Session session = sessionFactory.getCurrentSession();
//        List<Sex> allSex = session.createNamedQuery("from Sex", Sex.class).getResultList();
        Query<Sex> query = session.createQuery("from Sex", Sex.class);
        List<Sex> allSex = query.getResultList();
        
        return allSex;
    }
    
    
}
