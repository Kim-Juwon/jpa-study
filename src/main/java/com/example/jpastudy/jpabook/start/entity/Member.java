package com.example.jpastudy.jpabook.start.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String username;
    private Integer age;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
