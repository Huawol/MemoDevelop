package com.example.memodevelop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "board")
public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longtext")
    private String contents;

    @ManyToOne // 연관 관계 설정
    @JoinColumn(name = "member_id")
    private Member member;
}
