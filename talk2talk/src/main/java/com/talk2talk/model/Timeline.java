package com.talk2talk.model;


import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Timeline {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @Column(nullable = false)
    private User user;

    private Integer numOfLikes;

    private Integer numOfDislikes;

    private Integer noOfGivenComments;

    private Integer noOfReceivedComments;

    @OneToMany
    private List<Post> posts;




}
