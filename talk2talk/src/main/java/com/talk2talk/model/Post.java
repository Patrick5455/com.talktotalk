package com.talk2talk.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PostType postType;

    @Column(nullable = false)
    private Date postDate;

    @Column(nullable = false)
    private String postContent;

    @ManyToOne
    private User user;

    @ManyToOne
    private Timeline timeline;

    @OneToMany
    private List<Comment> comments;





}
