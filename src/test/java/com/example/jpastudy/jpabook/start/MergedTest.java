package com.example.jpastudy.jpabook.start;

import com.example.jpastudy.jpabook.start.entity.Member;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MergedTest {
    @Test
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-practice");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Member member = new Member();
            member.setId("1");
            member.setUsername("김주땡");
            member.setAge(2222);

            Member mergedMember = entityManager.merge(member);

            System.out.println("------------------------------------");
            System.out.println(mergedMember == member);
            System.out.println("mergedMember: " + mergedMember);
            System.out.println("member: " + member);
            System.out.println("------------------------------------");
            System.out.println("id: " + mergedMember.getId());
            System.out.println("name: " + mergedMember.getUsername());
            System.out.println("age: " + mergedMember.getAge());

            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
        }
    }
}
