package com.talk2talk.model;

import org.springframework.lang.Nullable;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (nullable = false)
    private String firstName;

    @Column (nullable = false)
    private  String lastName;

    @Column (nullable = false)
    private String password;

    @Column (nullable = false)
    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    private Timeline userTimeline;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Post> userPosts;






    
}
