package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {

    private final Integer idNumber;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publishedPosts;
    private final LocalDate now = LocalDate.now();

    public ForumUser(Integer idNumber, String userName, char sex, LocalDate dateOfBirth, int publishedPosts) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.publishedPosts = publishedPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean getAge()
    {
        int age  = Period.between(getDateOfBirth(),now).getYears();
        if(age >= 20) return true;
        else return false;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
