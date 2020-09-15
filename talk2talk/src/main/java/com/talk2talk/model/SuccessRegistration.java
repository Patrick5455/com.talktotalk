package com.talk2talk.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SuccessRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.MERGE)
    @Column(nullable = false)
    private User user;


    @Column(nullable = false)
    private Date regDate;





}
