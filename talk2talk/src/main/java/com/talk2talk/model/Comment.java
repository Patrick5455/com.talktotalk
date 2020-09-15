package com.talk2talk.model;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;


    @ManyToOne
    @Column(nullable = false)
    private User user;

    private Integer noOfLikes;

    private Integer noOfDislikes;

    private String content;

    @ManyToOne
    private Post post;


}
