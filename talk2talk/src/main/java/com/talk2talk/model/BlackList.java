package com.talk2talk.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class BlackList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @Column(nullable = false)
    private User user;

    @Column(nullable = false)
    private Date date;
}
