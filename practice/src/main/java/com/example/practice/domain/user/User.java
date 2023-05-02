package com.example.practice.domain.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 25)
    private String name;

    private Integer age;

    public User(String name, Integer age) {
        if (name == null || name.isBlank() ) {
            throw new IllegalArgumentException(String.format("잘못된 name{%s}가 들어왔습니다", name));
        }
        this.name = name;
        this.age = age;
    }


}
