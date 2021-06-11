package com.schoolofnet.DataQuery;

import java.util.List;

import javax.persistence.EntityManager;

import com.querydsl.jpa.impl.JPAQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomRepositoryImpl implements CustomRepository {

    @Autowired private EntityManager entityManager;

    @Override
    public List<City> findAllDSL() {
        QCity city = QCity.city;
        JPAQuery<QCity> query = new JPAQuery<>(entityManager);
        query.from(city).fetch();
        return null;
    }    
}
