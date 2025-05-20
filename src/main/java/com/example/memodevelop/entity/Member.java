package com.example.memodevelop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="member")
public class Member extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // 유일해야 하기 때문
    private String username;

    @Column(nullable = false)
    private String password;

    private Integer age;

}
