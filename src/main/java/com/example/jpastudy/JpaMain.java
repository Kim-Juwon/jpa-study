package com.example.jpastudy;

import com.example.jpastudy.jpabook.start.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // 엔티티 매니저 팩토리 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        // 엔티티 매니저 생성
        EntityManager em = emf.createEntityManager();
        // 트랜잭션 획득
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        List<Member> members = getMembers(em);
        for (Member member : members) {
            System.out.println("id: " + member.getId());
            System.out.println("name: " + member.getUsername());
            System.out.println("age: " + member.getAge());
            System.out.println("----------------------------------");
        }

        tx.commit();

        em.close();
        emf.close();

    }

    public static void insertMember(EntityManager entityManager, Member member) {
        entityManager.persist(member);

    }

    public static Member getMember(EntityManager entityManager, String memberId) {
        Member member = entityManager.find(Member.class, memberId);
        return member;
    }

    public static void updateMemberAge(EntityManager entityManager, String memberId, Integer newAge) {
        Member member = entityManager.find(Member.class, memberId);
        member.setAge(newAge);
    }

    public static List<Member> getMembers(EntityManager entityManager) {
        List<Member> members = entityManager.createQuery("select m from Member m", Member.class)
                .getResultList();
        return members;
    }

}
