package com.example.jpastudy;

import javax.persistence.*;

public class FlushModeMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-practice");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        entityManager.setFlushMode(FlushModeType.AUTO); // 커밋이나 쿼리 실행 시 플러시
        entityManager.setFlushMode(FlushModeType.COMMIT); // 커밋 시에만 플러시
    }
}
