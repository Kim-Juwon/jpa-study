package com.example.jpastudy;

import com.example.jpastudy.jpabook.start.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MergeMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-practice");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Member member = new Member();
            member.setId("1");
            member.setUsername("김주원");
            member.setAge(23);

            // member 영속화
            entityManager.persist(member);
            // member 준영속화
            entityManager.detach(member);

            Member mergedMember = entityManager.merge(member);
            System.out.println("mergedMember.id: " + mergedMember.getId());
            System.out.println("mergedMember.name: " + mergedMember.getUsername());
            System.out.println("mergedMember.age: " + mergedMember.getAge());
            System.out.println("mergedMember == member: " + (mergedMember == member));

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }
}
