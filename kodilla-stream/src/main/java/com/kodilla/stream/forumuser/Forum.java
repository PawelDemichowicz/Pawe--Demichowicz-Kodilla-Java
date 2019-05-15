package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> users = new ArrayList<>();

    public Forum()
    {
        users.add(new ForumUser(123,"user1",'m', LocalDate.of(1979,2,3),101));
        users.add(new ForumUser(124,"user2",'m', LocalDate.of(1985,7,30),3));
        users.add(new ForumUser(125,"user3",'m', LocalDate.of(1987,5,13),59));
        users.add(new ForumUser(126,"user4",'m', LocalDate.of(1992,10,9),87));
        users.add(new ForumUser(127,"user5",'m', LocalDate.of(2001,9,14),264));
        users.add(new ForumUser(128,"user6",'m', LocalDate.of(1973,12,15),36));

    }

    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(users);
    }

}
