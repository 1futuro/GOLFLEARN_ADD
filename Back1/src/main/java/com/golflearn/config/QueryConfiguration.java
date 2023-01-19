package com.golflearn.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Configuration
public class QueryConfiguration {
	@PersistenceContext
	public EntityManager entityManager;
	
	@Bean
	public JPAQueryFactory queryFactory() {
		return new JPAQueryFactory(entityManager); 
	}
}
