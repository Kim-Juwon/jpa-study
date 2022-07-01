package com.example.jpastudy;

import com.example.jpastudy.jpabook.start.entity.Member;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-practice");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin(); // 트랜잭션 시작




            transaction.commit(); // 트랜잭션 커밋
        } catch (Exception e) {
            transaction.rollback();
        }
    }



}
