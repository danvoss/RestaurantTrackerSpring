package com.dvoss;

import javax.persistence.*;

/**
 * Created by Dan on 6/21/16.
 */
@Entity // <-- always use in order to have db
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false) // tell db these fields can't be null to prevent bad data down the line
    String name;

    @Column(nullable = false)
    String password;

    public User() {
    }

    public User(String name, String password) {
        // remember, the db generates id, so absent from constructor
        this.name = name;
        this.password = password;
    }
}
