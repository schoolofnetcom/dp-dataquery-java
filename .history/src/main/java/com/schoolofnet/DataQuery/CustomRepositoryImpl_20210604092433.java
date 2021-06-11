package com.schoolofnet.DataQuery;

import java.util.List;

import javax.persistence.EntityManager;

import com.querydsl.jpa.impl.JPAQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomRepositoryImpl implements CustomRepository {

    @Autowired private EntityManager entityManager;

    @Override
    public List<City> findAllDSL() {
        // JPAQuery query = new JPAQuery(entityManager);
        // query.from(City);
        return null;
    }
    
}
