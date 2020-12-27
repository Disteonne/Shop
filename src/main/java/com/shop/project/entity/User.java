package com.shop.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private UserType type;
    @OneToMany
    private List<Product> basket=new ArrayList<>();
}
